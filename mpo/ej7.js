
function mio(params){
    document.getElementById("aqui").innerText = " "
    const letrasDNI = ['t', 'r', 'w', 'a', 'g', 'm', 'y', 'f', 'p', 'd', 'x', 'b', 'n', 'j', 'z', 's', 'q', 'v', 'h', 'l', 'c', 'k', 'e'];

    for (let i = 1; i < 1000; i++) {
        if (letrasDNI[i%23] == params.key) {
            document.getElementById("aqui").innerText += (" \n DNI: " + i + " Coincide con la letra: " + letrasDNI[i%23])
    }
    
    }
}




document.onkeydown = mio