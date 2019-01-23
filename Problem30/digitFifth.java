import java.util.Stack;

class digitFifth{

    public static void main(String[] args){
	Stack<Integer> fifthStack = new Stack<Integer>();
	int fifthStackTotal = 0;
	for(int i = 2; i < 100000000; i++){
	    int temp = i;
	    int remainder = temp % 10;
	    int total = 0;
	    while(temp >= 1){
		total += Math.pow(remainder,5);
		temp = temp/10;
		remainder = temp%10;
	    }
	    if(total == i){
		System.out.println(i);
		fifthStack.push(i);
	    }
	}
	while(!fifthStack.isEmpty())
	    fifthStackTotal += fifthStack.pop();
	System.out.println("Total = " + fifthStackTotal);
    }
}
