//Generate Permutations Algorithm
function permutator(inputArray){
    let result = [];
    
    const permute = (arr, m = []) =>{
	if(arr.length === 0){
	    result.push(m);
	}
	else{
	    for(let i = 0; i < arr.length; i++){
		let curr = arr.slice();
		let next = curr.splice(i, 1);
		permute(curr.slice(), m.concat(next));
	    }
	}
    }

    permute(inputArray);
    return result[999999];
}
let a = [0,1,2,3,4,5,6,7,8,9];
console.log("Answer is: "+permutator(a));
