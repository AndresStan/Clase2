
   var fecha
   var fechaA


   function empezar(){
      console.log("Empezar")
      fecha = new Date();


   }

   var diferencia;


   function acabar(){
      console.log("Parar")
      fechaA = new Date();
      diferencia = fechaA - fecha
      document.write(`${diferencia/1000} segundos`)
   }

   document.write("<button onClick='empezar()' >Empezar a contar</button> <br> <br>")
   document.write("<button onClick='acabar()' >Parar el Contador</button>")
