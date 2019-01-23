class champernowneConstant{

    public static void main(String[] args){
	char d1 ='e';
	char d10 = 'e';
	char d100 ='e';
	char d1000 ='e';
	char d10000 ='e';
	char d100000 ='e';
	char d1000000 = 'e';
	String place = "";
	int total = 0;
	for(int i = 1; i < 1000000; i++){
	    place += Integer.toString(i);
	    if(place.length() >= 1000000)
		break;	    
	}
	d1 = place.charAt(1-1);
	d10 = place.charAt(10-1);
	d100 = place.charAt(100 - 1);
	d1000 = place.charAt(1000 - 1);
	d10000 = place.charAt(10000-1);
	d100000 = place.charAt(100000-1);
	d1000000 = place.charAt(1000000-1);
	System.out.println("d1 = " + d1);
	System.out.println("d10 = " + d10);
	System.out.println("d100 = " + d100);
	System.out.println("d1000 = " + d1000);
	System.out.println("d10000 = " + d10000);
	System.out.println("d100000 = " + d100000);
	System.out.println("d1000000 = " + d1000000);
	total = Character.getNumericValue(d1) * Character.getNumericValue(d10) * Character.getNumericValue(d100) * Character.getNumericValue(d1000) * Character.getNumericValue(d10000) * Character.getNumericValue(d100000) * Character.getNumericValue(d1000000);
	System.out.println("Total = " + total);
    }
}
