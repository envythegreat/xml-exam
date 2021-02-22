const urlApi = 'http://localhost:4567/relevebank';
let warpper = $("#wrapper");
let table = $('#table');

function tablerow (type, date, sold, desc){

  let row =  `
    <tr class="row">
      <td class="cell">${type}</td>
      <td class="cell">${date}</td>
      <td class="cell">${sold}</td>
      <td class="cell">${desc}</td>
    </tr>
  `;
  table.append(row);
}
const request = new XMLHttpRequest();


request.onreadystatechange = function () {
    if (this.readyState === 4 && this.status === 200){
        let data = JSON.parse(this.responseText);
        let operations = data.operations
        let headerdata = `
          <h3>RIB : ${data.rib}</h3>
          <h3>Date de Relevé : ${data.dateReleve}</h3>
          <h3>votre Solde :${data.solde} </h3>
        `;
        warpper.prepend(headerdata)
        for(let i = 0; i < operations.length; i++){
          tablerow(operations[i].type,operations[i].date,operations[i].montant,operations[i].description)
        }
    }
};
request.open('GET', urlApi, true);
request.send();
