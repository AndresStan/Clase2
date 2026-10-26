    /* Ejercicio 4  */
    function click1() {
        console.log(this);
        this.classList.add("hidden")
    }
    function dblclick() {
        this.remove()
        console.log("ELiminado");
    }
    function reaparecer() {
       document.querySelectorAll("p").forEach(p => p.classList.remove("hidden"));

    }
    var elementosP = document.getElementsByTagName("p")

    for (let i = 0; 0 < elementosP.length; i++) {
       elementosP[i].onclick = click1
       elementosP[i].ondblclick = dblclick
        
    }