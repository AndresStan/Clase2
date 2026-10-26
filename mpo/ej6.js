var estaalertando = false

function comenzar() {
        console.log("alertando");
        if (!estaalertando) {
            estaalertando = true
            mi = setInterval(() => {
            alert("alerta")
        }, 2000);
        } else {
            console.log("Ya se esta alertando");     
        }
}


function detener() {
    if (estaalertando) {
         clearInterval(mi)
         estaalertando=false
         console.log("Parado");
    } else {
        console.log("Ya esta parado");    
    }
}