var parar = false;
var vector = [];

while (!parar) {
    var num = parseInt(prompt("Indica el numero"))
   
    if (num == 0) {
        parar = true
        break
    }

     vector.push(num)

}

console.log(vector.reduce((ac, sum) => ac+sum)/vector.length);
