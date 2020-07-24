let isSquare = function(x){
    return Math.sqrt(x) % 1 === 0;  
};
let highestD = 0;
let highestX = 0;
let leftOverD = [];
let nonSquareD = [];
for(let num = 1; num<1001;num++)
    if(!isSquare(num))
       nonSquareD.push(num);
for(let d = 0; d < nonSquareD.length; d++){
    for(let x = 1; x < 80001; x++){
	for(let y = 1; y < 4001; y++){
	    if((1+nonSquareD[d]*(y*y)) === (x*x)){
		if(x>highestX){
		    highestX = x;
		    highestD = nonSquareD[d];
		}
		console.log("D=" + nonSquareD[d] + "  " + x + " - " + d + "x"+y+"=1");
		y = 1000000;
		x = 1000000;
	    }
	    if((x===80000) && (y===4000))
		leftOverD.push(d);
	} 
    }
}
console.log("Highest X =" + highestX +"  Highest D = "+highestD);
console.log(leftOverD);
console.log(leftOverD.length);

for(let k = 0; k < leftOverD.length;k++){
    for(let x =1; x< 100000;x++){
	for(let y=1;y< 100000; y++){
	    if((1+leftOverD[k]*(y*y)) === (x*x)){
		if(x>highestX){
		    highestX = x;
		    highestD = leftOverD[k];
		}
		console.log("D=" +leftOverD[k] + "  X="+x);
		y=1000000000000;
		x=1000000000000;
	    }
	}
    }
}
console.log("Highest X = " + highestX + "   Highest D = " + highestD);