var colores = ["green", "blue", "yellow", "pink", "red", "purple"]

var boton = document.createElement("button")
boton.addEventListener("click", mio)
boton.innerText="Cambiar"
boton.style="padding: 10px"
document.body.appendChild(boton)



function numeroAleatorio() { // Rnadom
  return Math.floor(Math.round(Math.random()*5))
}


function mio() {
    
    document.body.style = `background-color: ${colores[numeroAleatorio()]}`;
    
}