const tipoRaid = document.getElementById("tiporaid")
const numdiscos = document.getElementById("numdisc")
const tamañoDiscos = document.getElementById("teras")

function tipoRaidCambiado() {
console.log("asd");

}


function numdiscCambiado() {
console.log("asd");

}

function tamañoCambiado() {
console.log("asd");

}

tipoRaid.addEventListener("change", tipoRaidCambiado)
numdiscos.addEventListener("change", numdiscCambiado)
tamañoDiscos.addEventListener("change", tamañoCambiado)


for (let i = 1; i <= 10; i++) {
    var opcion = document.createElement("option")
    opcion.value = i
    opcion.text = i
    numdiscos.appendChild(opcion)
}