for(let i = 1; i < 1001;i++){
    if(Math.pow(i,i) === Infinity)
	break;
    console.log(i-1);
    console.log(Math.pow(i,i));
}