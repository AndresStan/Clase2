let horario=[
            ["IPPE", "PROY", "IPPE", "AD", "SGE"],
            ["DI", "SGE", "AD", "AD", "SGE"],
            ["RECREO","RECREO","RECREO","RECREO","RECREO"],
            ["DI", "SGE", "AD", "AD", "SASP"],
            ["DWC", "PMDM", "PMDM", "PROY", "DI"],
            ["RECREO","RECREO","RECREO","RECREO","RECREO"], 
            ["DWC", "PMDM", "PMDM", "PSP", "DI"],
            ["DWC", "PMDM", "PMDM", "PSP", "DI"]
];

let diasSemana = [" ","Lunes", "Martes", "Miercoles", "Jueves", "Viernes"]

var primeraHora = new Date(2026, 1, 1, 8, 30)


let duracionRecreos = [20, 15]; 
let indiceRecreo = 0;

let horas = []
let totalFilas = horario.length;

for (let index = 1; index <= totalFilas; index++) {

   if (horario[index-1][0].includes("RECREO")) {
      // Pillamos los minutos del array de duraciones según el orden
      let minutos = duracionRecreos[indiceRecreo];

      horas[index] = (primeraHora.getHours()+':'+primeraHora.getMinutes())
      primeraHora.setMinutes(primeraHora.getMinutes() + minutos)
      horas[index] = (horas[index]+'-'+primeraHora.getHours()+':'+primeraHora.getMinutes())
      
      indiceRecreo++; // Pasamos al siguiente recreo
   } else {
      horas[index] = (primeraHora.getHours()+":"+primeraHora.getMinutes()+"-")
      primeraHora.setMinutes(primeraHora.getMinutes()+50)
      horas[index] = horas[index]+primeraHora.getHours()+":"+primeraHora.getMinutes()
      
      if (index < totalFilas && !horario[index][0].includes("RECREO")) {
         primeraHora.setMinutes(primeraHora.getMinutes()+5)
      }
   }
}

// Pintar la tabla
document.write("<table>")

for (let i = 0; i <= totalFilas; i++) {
   if (i == 0) {
      document.write("<tr>")
      for (let index0 = 0; index0 < diasSemana.length ; index0++) {
         document.write(`<th> ${diasSemana[index0]} </th>`)
      }
      document.write("</tr>")
   } else {
      document.write("<tr>")
      document.write(`<td> ${horas[i]} </td>`)
      for (let j = 0; j < 5; j++) {
         document.write(`<td> ${horario[i-1][j]} </td>`)
      }    
      document.write("</tr>")
   }
}
document.write("</table>")