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
function sortInteger(x){
    let digits = x.toString().split('');
    let sortedDigits = digits.sort();
    return sortedDigits;
}
function hasTwoZeros(x){
    let numZeros = 0;
    for(let i = 0; i < x.length; i++){
	if(x[i] === "0")
	    numZeros++;
    }
    if(numZeros >= 2)
	return true;
    else
	return false;
}
function hasSameNumbers(x,y){
    for(let i = 0; i < x.length; i++){
	if(x[i] !== y[i])
	    return false;
    }
    return true;
}
function checkArrayIsEqual(x,y){
    for(let i = 0; i<y.length; i++){
	if(x[i] !== y[i])
	    return false;
    }
    return true;
}
function findPrimeWith3Permutations(x,y){
    let numPermutations = 0;
    let arrayOfPermutations = [];
    for(let i = y ; i < arrayOfPrimes.length-y; i++){
	if(checkArrayIsEqual(x,arrayOfPrimes[i])){
	    numPermutations++;
	    arrayOfPermutations.push(arrayOfPrimes[i]);
	}
    }
    if(numPermutations >= 10){
	//console.log(arrayOfPermutations);
	return true;
    }
    else
	return false;
}
let numPrimes = 0;
let arrayOfPrimes = [];

for(let i = 1000; i<10000; i++){
    if(isPrime(i) && !hasTwoZeros(sortInteger(i))){
	//console.log(i);
	numPrimes++;
	arrayOfPrimes.push(sortInteger(i));
	for(let j=1; j<10000;j++){
	    if(isPrime(i+j) && (isPrime(i+j+j))){
		let k = i+j+j;
		if(k.toString().length < 5)
		    if(checkArrayIsEqual(sortInteger(i),sortInteger(k)))
			if(checkArrayIsEqual(sortInteger(i),sortInteger(i+j))){
			    console.log("i=" + i + " j=" + j);
			    console.log(i.toString()+(i+j).toString()+(i+j+j).toString());
			}
	    }
	}
    }
}
console.log("Num of Primes b/ween 1000-9999 = "+arrayOfPrimes.length);