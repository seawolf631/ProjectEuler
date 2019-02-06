function findFactors(remainder){
    let factors = [], i;
    
    for(i = 2; i <= remainder; i++){
	while((remainder % i) === 0){
	    if(!factors.includes(i))
		factors.push(i);
	    remainder /= i;
	}
    }
    return factors;
}
for(let i = 1; i < 500000; i++){
    if(findFactors(i).length > 3)
	if(findFactors(i-1).length>3)
	    if(findFactors(i-2).length>3)
		if(findFactors(i-3).length>3)
		    console.log(findFactors(i) + " Number=" +(i-3));
}