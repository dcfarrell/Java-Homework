public class palindrome
{
   private boolean palindrome;
	private String str;
	
	palindrome(String s)
	{
		str = s;
		palindrome = isPalindrome(); 
	}
   
	/**
   * precondition:   str is not null
   *	               palindrome is true or false
   * Postcondition: returns a string in the format:
   *			   	  String:		value of str
   *				     Palindrome:	value of palindrome
   */
	public String toString()
	{
		/* to be redefined in part (a) */
     
      
      return "String:\t\t"+str+"\nPalindrome:\t"+palindrome+"\n";
	}
	
   /**
   *  Precondition:   str is not null	
   *  Postcondition:  returns true if str is a palindrome, and false otherwise
   */		
	private boolean isPalindrome()
	{
		/* to be implemented in part (b) */
      String bw = "";
      for(int x = str.length()-1; x>=0; x--)
         {
           bw = bw + str.substring(x,x+1);
         }
         
      return bw.equalsIgnoreCase(str);
	}	

}