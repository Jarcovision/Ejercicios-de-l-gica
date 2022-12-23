let max = 100;
let min = 1;
let numerom = Math.random() * (max - min) + min;
numerom = parseInt(numerom);
let usuario = prompt("Adivina el número secreto entre 1 y 100. Ingresa tu respuesta.");

while (true) {
  usuario = prompt("Ups, el número secreto es incorrecto, vuelve a intentarlo.");

  if (usuario == numerom) {
    lert("HAS GANADO");
    break;
  } else if (usuario == 0) {
    break;
  }
}
