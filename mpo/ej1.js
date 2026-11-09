var boton = document.createElement("button")
boton.innerText="Nuevo numero"
document.body.appendChild(boton)

var lista = document.createElement("ul")
document.body.appendChild(lista)


boton.addEventListener("click", nv)

function nv(params) {
    var num =  Math.round(Math.random()*100+1)
    var li = document.createElement("li")
    li.innerText=num
    lista.appendChild(li)

}