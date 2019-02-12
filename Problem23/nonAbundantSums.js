function sumOfDivisors(x){
    let total = 0;
    for(let i = 1; i < x; i++)
	if(x % i === 0)
	    total += i;
    return total;
}
function isAbundant(x){
    if(x < sumOfDivisors(x))
	return true;
    else
	return false;
}
//Create array of isAbundant up tp 28123
let isAbundantObject = {};
for(let i = 1; i<28124; i++){
    if(isAbundant(i))
	isAbundantObject[i] = true;
    else
	isAbundantObject[i] = false;
}
let answer = 1;
let arrayToLimit = [];
for(let i = 1; i < 28124; i++)
    for(let j = 1; j < i; j++){
	if( isAbundantObject[j] && isAbundantObject[i-j])
	    j = i + 1;
	if( j === i -1){
	    answer += i;
	}
    }

console.log("The answer is: " + answer);