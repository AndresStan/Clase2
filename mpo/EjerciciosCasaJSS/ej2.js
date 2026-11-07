var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E',
'T']; 

var dni = prompt("Dime tu dni con su letra")

if (dni.length != 9 ) {
    alert("El dni introducido no esta escrito correctamente")
}


var tieneLetra = false;

for (const letra of letras) {
     if (dni.charAt(8).toUpperCase() == letra) {
        tieneLetra = true
    }
}

console.log(tieneLetra);
var letra = dni.charAt(8)

var slice = parseInt(dni.slice(0, 8))
var resto = slice%23;

if (letra == letras[resto]) {
    alert("El dni es correcto");
    
} else{
    alert("El dni es incorrecto")
}


