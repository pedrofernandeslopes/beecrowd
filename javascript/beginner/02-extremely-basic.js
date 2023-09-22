//Faça um programa que leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável X.

var lines = input.split('\n');
var A = parseInt(lines.shift());
let B = parseInt(lines.shift());

X = A + B;
console.log(`X = ${X}`);


