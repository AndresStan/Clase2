var colores = ["green", "blue", "yellow", "pink", "red", "purple"]

function numeroAleatorio(min, max) { // Rnadom
  return Math.round(Math.random() * (max - min) + min);
}


function mio() {
    
    document.body.style.backgroundColor = colores[numeroAleatorio(1,5)];
    
}