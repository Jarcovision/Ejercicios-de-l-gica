
let celcius = parseInt(prompt("Ingresa la temperatura en grados Celcius."));

function CelsiusAFahrenheit(celcius) {
    let conversion = (celcius * 1.8) + 32;
 return conversion;    
}

function CelsiusAKelvin(celcius) {
    let conversion = celcius + 273.15;
    return conversion;
}

// Pude declarar la variable "conversion" dos veces porque es local a la función donde se encuentra.

console.log("Grados Kelvin: " + CelsiusAKelvin(celcius));
console.log("Grados Fahrenheit: " + CelsiusAFahrenheit(celcius));

