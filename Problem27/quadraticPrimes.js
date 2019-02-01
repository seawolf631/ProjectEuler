let primeKey = {};
function isPrime(x){
    if(x <= 1)
	return false;
    if(primeKey.hasOwnProperty(x))
	return primeKey[x];
    for(let i = 2; i < x; i++){
	if(x % i === 0){
	    primeKey[x] = false;
	    return false;
	}
    }
    primeKey[x] = true;
    return true;
}
let totalPrimes = 0;
let tempPrimes = 0;
let tempN = 0;
let finalA = 0;
let finalB = 0;
for(let limit = 1; limit < 200; limit++){
for(let a=999; a > -1000; a--){
    for(let b = -1000; b < 1001; b++){
	tempPrimes = 0;
	for(let n=0; n < limit ; n++){
	    tempN = n;
	    let total = (n*n) + (a*n) + b;
	    if((n===0) && (isPrime(b))){
		tempPrimes++;
	    }
	    else if((n===0) && (!isPrime(b))){
		n=limit+1;
	    }
	    //console.log(JSON.stringify(primeKey));
	    else if(isPrime(total)){
		tempPrimes++;
	    }
	    else{
		n=limit+1;
	    }
	}
	if(tempPrimes === totalPrimes){
	    finalA = -1000;
	}
	if(tempPrimes > totalPrimes){
	    totalPrimes = tempPrimes;
	    console.log("N=" + tempN + " A="+a+" B="+b+"  numPrimes="+totalPrimes);
	    if((a === finalA) && (b === finalB)){
		console.log("Here is the answer!!!!!!");
		let answer = a * b;
		console.log("Answer: " + answer);
	    }
	    finalA = a;
	    finalB = b;
	}
    }
}
}