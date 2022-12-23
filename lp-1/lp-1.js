let a = parseInt(prompt ("Ingresa el número 1."));
let b = parseInt(prompt ("Ingresa el número 2."));
let c = parseInt(prompt ("Ingresa el número 3."));

if (a >= b && a >= c) {
    if (b > c) {
        console.log(a, b, c);
    } else {
        console.log(a, c, b);
    }
} else if (b >= a && b >= c) {
    if  (a > c) {
        console.log(b, a, c);
    } else {
        console.log(b, c, a);
    }
}  else if (c >= a && c >= b) {
    if (a > b) {
        console.log( c, a, b);
    } else {
        console.log( c, b, a);
    }
}

