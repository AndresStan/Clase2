var p = document.createElement("p")
function mio(params) {
    
    const letrasDNI = ['t', 'r', 'w', 'a', 'g', 'm', 'y', 'f', 'p', 'd', 'x', 'b', 'n', 'j', 'z', 's', 'q', 'v', 'h', 'l', 'c', 'k', 'e'];

    p.innerText=""
    for (let i = 1; i <= 9999; i++) {
        if (letrasDNI[i % 23] == params.key) {
            
            
            p.innerText += (" \n DNI: " + i + " Coincide con la letra: " + letrasDNI[i % 23])
            document.body.appendChild(p)
        }
    }
}



document.onkeydown = mio