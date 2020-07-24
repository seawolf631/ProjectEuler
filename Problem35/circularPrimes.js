//Generate Permutations Algorithm
function permutator(inputArray){
    let result = [];

    const permute = (arr, m=[]) =>{
	if(arr.length === 0)
	    result.push(m);
	else{
	    for(let i = 0; i < arr.length; i++){
		let curr = arr.slice();
		let next = curr.splice(i,1);
		permute(curr.slice(), m.concat(next));
	    }
	}
    }
    permute(inputArray);
    return result;
}
// Check if Prime
let objectOfPrimes = {};
function isPrime(x){
    if(x in objectOfPrimes)
	return objectOfPrimes[x];
    for(let i = 2; i < ((x/2)+1); i++){
	if(x % i === 0){
	    objectOfPrimes[x] = false;
	    return false;
	}
    }
    objectOfPrimes[x] = true;
    return true;
}
//Find Primes less than 1 million
let numberOfCircularPrimes = 0;
for(let i = 2; i < 1000000; i++){
    //check to see if number contains 0,2,4,6,8 
    if(!(i+'').indexOf('0') > -1)
	if(!(i+'').indexOf('2') > -1)
	    if(!(i+'').indexOf('4')>-1)
		if(!(i+'').indexOf('6')>-1)
		    if(!(i+'').indexOf('8')>-1)
			if(isPrime(i)){
	//convert integer into array then find permutations
	let permutations = permutator((""+i).split(""));
	//Reduce arrays into strings
	for(let k = 0; k < permutations.length;k++){
	    permutations[k] = permutations[k].reduce((x,y)=>x.concat(y));
	}
	//Convert strings into Numbers
	permutations = permutations.map(parseFloat);
	let isPrimePermutations = permutations.map(x=>isPrime(x));
	let isTruePrimePermutations = isPrimePermutations.reduce((x,y)=>x&&y);
	if(isTruePrimePermutations){
	    console.log("CircularPrime="+i);
	    numberOfCircularPrimes++;
	}	    
    }
    if(i%100000===0)
	console.log("we are at i="+i);
}

console.log("The answer is: "+numberOfCircularPrimes);