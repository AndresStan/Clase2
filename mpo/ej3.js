// 3. Haz un programa que cree 100 elementos “checkbox” con números aleatorios. Además,
// la página tendrá un botón “Marcar todos” y un botón “Desmarcar todos”.


var boton = document.createElement("button")
boton.innerText = "Activar todos"
boton.style = "margin-right: 5px"
boton.addEventListener("click", activar)


var boton2 = document.createElement("button")
boton2.innerText = "Desactivar todos"
boton2.addEventListener("click", desactivar)




document.body.appendChild(boton)
document.body.appendChild(boton2)


for (let i = 1; i <= 100; i++) {
    var label = document.createElement("label")
    label.style = "margin: 5px"
    label.style = "display: block"
    label.innerText =  Math.round((Math.random()*100)+1)
    var input = document.createElement("input")
    input.type = "checkbox"
    label.appendChild(input)
    document.body.appendChild(label)

}

function activar() {
    var all = document.getElementsByTagName("input")
    for (let i = 0; i < all.length; i++) {
        all[i].checked = true
        
    }
    
}

function desactivar(params) {
     var all = document.getElementsByTagName("input")
    for (let i = 0; i < all.length; i++) {
        all[i].checked = false
        
    }
}




