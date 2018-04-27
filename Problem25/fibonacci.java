import java.io.*;
import java.math.BigInteger;

class fibonacci{
    int currentIndex;
    boolean isZero = true;
    BigInteger A = BigInteger.valueOf(1);
    BigInteger B = BigInteger.valueOf(1);
    BigInteger[] fibArray = {A,B};
    int currentFibNumber = 2;
    public fibonacci(){
	
    }
    public BigInteger returnFibValue(int fibNumber){
	currentFibNumber = fibNumber;
	currentIndex = 0;
	for(int i = 2; i < fibNumber; i++){
	    if(currentIndex == 0){
		fibArray[0] = fibArray[0].add(fibArray[1]);
		currentIndex++;
	    }
	    else{
		fibArray[1] = fibArray[1].add(fibArray[0]);
		currentIndex--;
	    }
	}
	if(currentIndex == 0){
	    System.out.println(fibArray[0] + " " + fibArray[1]);
	    return fibArray[1];
	}
	if(currentIndex == 1){
	    System.out.println(fibArray[0] + " " + fibArray[1]);
	    return fibArray[0];
	}
	return BigInteger.valueOf(-1);
    }
    public static void main(String[] args) throws IOException{
	fibonacci current = new fibonacci();
	int input = Integer.parseInt(args[0]);
	BigInteger answer = current.returnFibValue(input);
	System.out.println(answer);
	System.out.println("Digits: " + answer.toString().length());
    }
}
