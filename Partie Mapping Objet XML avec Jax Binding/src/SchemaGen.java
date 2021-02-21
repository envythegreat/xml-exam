import java.io.*;

import javax.xml.bind.*;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import releve.Releve;

public class SchemaGen {

	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Releve.class);
		context.generateSchema(new SchemaOutputResolver() {

			@Override
			public Result createOutput(String namespaceuri, String suggestedFileName) throws IOException {
				File f = new File("schema.xsd");
				StreamResult result = new StreamResult(f);
				result.setSystemId(f.getName());
				return result;
			}
		});

	}

}
