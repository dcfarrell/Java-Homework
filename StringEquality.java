public class StringEquality
{
	String wordOne, wordTwo;

	public StringEquality(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}
   
  
	public String checkEqual(String one, String two)
	{
		//YOUR CODE HERE (must use equals)
      //if(one == two)
        return "eh";
      
   }
   
   public String checkCompare(String one, String two)
	{
		//YOUR CODE HERE (must use compereTo)
     if(one.compareTo(two) == 0)
      return one+"has the same letters as"+two;
     else
      return one+"does not have the same letters as"+two;
   }


   
}