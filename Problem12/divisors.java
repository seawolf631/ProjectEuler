import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;
import java.util.ArrayList;

class divisors{
    BigInteger A = BigInteger.valueOf(1);
    BigInteger B = BigInteger.valueOf(3);
    BigInteger[] triangleArray = {A,B};
    int currentTriangle = 2;
    int currentIndex;
    public divisors(int triangleNumber){
	currentIndex = 0;
	for(int i = 1; i < triangleNumber; i++){
	    if(currentIndex == 0){
		triangleArray[1] = triangleArray[0].add(BigInteger.valueOf(currentTriangle));
		currentTriangle++;
		currentIndex++;
	    }
	    else{
		triangleArray[0] = triangleArray[1].add(BigInteger.valueOf(currentTriangle));
		currentTriangle++;
		currentIndex--;
	    }
	}
    }
    public BigInteger sqrt(BigInteger x){
	BigInteger a = BigInteger.ONE;
	BigInteger b = new BigInteger(x.shiftRight(5).add(new BigInteger("8")).toString());
	while(b.compareTo(a) >= 0){
	    BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
	    if(mid.multiply(mid).compareTo(x) > 0)
		b = mid.subtract(BigInteger.ONE);
	    else
		a = mid.add(BigInteger.ONE);
	}
	return a.subtract(BigInteger.ONE);
    }
    public int findNumberOfDivisors(){
    	BigInteger currentValue = triangleArray[currentIndex];
    	System.out.println("TriangleNumber: " + currentValue);
    	int numberOfDivisors = 0;
    	BigInteger i = BigInteger.valueOf(1);
	BigInteger sqrtCurrent = sqrt(currentValue);
    	int comparison = i.compareTo(sqrtCurrent);
    	while( comparison == -1 || comparison == 0){
	    if((currentValue.mod(i)).equals(BigInteger.valueOf(0)))
		numberOfDivisors++;
	    i = i.add(BigInteger.valueOf(1));
	    comparison = i.compareTo(sqrtCurrent);
	}
	return numberOfDivisors * 2;
    }
    public static void main(String[] args){
	int testInput = Integer.parseInt(args[0]);
	int largestNumberOfDivisors = 1;
	for(int i = 1; i <= testInput; i += 1){
	    divisors test = new divisors(i);
	    int numberOfDivisors = test.findNumberOfDivisors();
	    if(numberOfDivisors >= 500){
		
		System.out.println("Number of Divisors = " + numberOfDivisors);
		largestNumberOfDivisors = numberOfDivisors;
		break;
		}
	    
	    }
    }
}
