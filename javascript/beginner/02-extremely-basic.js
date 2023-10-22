var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var A = parseInt(lines.shift());
let B = parseInt(lines.shift());
x = A + B;

console.log(`X = ${x}`);



