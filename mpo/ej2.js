var tabla = document.createElement("table")
var contador = 1

    for (let j = 1; j <= 100; j++) {

        for (let i = 1; i <= 100; i++) {
            var cos = document.createElement("td")
            cos.innerText=contador
            contador++
            cos.addEventListener("mouseover", porEncima)
            cos.addEventListener("mouseout", porFuera)
            tabla.appendChild(cos)
        }
        var ces = document.createElement("tr")
        tabla.appendChild(ces)
        
    }

var boton = document.createElement("button")
boton.innerText="Calcular pares"
boton.style="margin: 5px; padding: 22px"
boton.addEventListener("click", calcular)
document.body.appendChild(boton)
document.body.appendChild(tabla)

function calcular(params) {
    var coleccionNumeros = document.getElementsByTagName("td")
    for (const numero of coleccionNumeros) {
        if (parseInt(numero.textContent) % 2 == 0 ) {
            numero.style="background-color: yellow"
        }
        
    }
}

function porEncima(params) {
    this.style="background-color: blue"
}

function porFuera(params) {
    this.style="background-color: white"
}