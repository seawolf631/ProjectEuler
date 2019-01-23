import java.util.Hashtable;

class distinctPowers{

    public static void main(String[] args){
	Hashtable<Double, Double> distinctTable = new Hashtable<Double,Double>();
	for(int i = 2; i <= 100; i++)
	    for(int j = 2; j <= 100; j++){
		Double newPow = Math.pow(i,j);
		if(!distinctTable.containsKey(newPow))
		    distinctTable.put(newPow,newPow);
	    }
	System.out.println("The Size is: " + distinctTable.size());	
    }
}
