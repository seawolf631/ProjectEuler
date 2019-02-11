let limit = 50000000;
let factorials = [1,1,2,6,24,120,720,5040,40320,362880];
for(let i = 10; i < limit; i++){
    let factorialSum = 0;
    let arrayOfDigits = i.toString().split("").map(function(x){return parseInt(x)});
    for(let y = 0; y < arrayOfDigits.length; y++){
	factorialSum += factorials[arrayOfDigits[y]];
    }
    if(i === factorialSum)
	console.log("i="+i + "   factorialOfDigits=" + factorialSum);
}