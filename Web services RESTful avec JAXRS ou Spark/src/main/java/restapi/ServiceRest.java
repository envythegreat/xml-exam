package restapi;

import java.io.*;

import javax.xml.bind.*;


import static spark.Spark.*;
import com.google.gson.Gson;


public class ServiceRest {

	public static void main(String[] args) throws Exception {
		Gson gson = new Gson();
		JAXBContext jc=JAXBContext.newInstance(Releve.class);
		Unmarshaller unmarshaller=jc.createUnmarshaller();
		Releve releve=(Releve) unmarshaller.unmarshal(new File("releve.xml"));
		
		get("/relevebank", (req, res) -> {
			res.header("content-type", "application/json");
			return gson.toJson(releve);
		});
		
		
	}

}
