

class doublePalindromes{
    public static boolean isPalindrome(String number){
	int stringLength = number.length();
	for(int k = 0; k < stringLength; k++)
	    if((number.charAt(k)) != (number.charAt(stringLength-1-k)))
		return false;
	return true;
    }
    public static void main(String[] args){
	int total = 0;
	for(int i = 1; i < 1000000; i++){
	    String iToString = Integer.toString(i);
	    String iToBinary = Integer.toBinaryString(i);
	    if(isPalindrome(iToString) && isPalindrome(iToBinary))
		total += i;
	}
	System.out.println(total);
    }
}
