//Function for d(n) in problem
function sumOfDivisors(x){
    let total = 0;
    for(let i = 1; i < x;i++){
	if(x % i === 0)
	    total += i;
    }
    return total;
}
let answer = 0;
for(let a = 1; a < 10000; a++){
    let b = sumOfDivisors(a);
    let bSum = sumOfDivisors(b);
    if(a === bSum)
	if(a !== b){
	    answer += a;
	}
}
//Here is the answer
console.log("The answer is: "  + answer);