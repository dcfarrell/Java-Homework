public class StringChecker
{
	private String word;//global variable

	public StringChecker() //default constructor method
	{
      word = ""; //initializing gobal variable to default value
	}

	public StringChecker(String s) //non-default constructor method
	{
      word = s; //initializing global variable to value stored in local variable s
	}

   public boolean findLetter(char c)
   {
   if (word.indexOf(c)>-1)//if statement to see if the character exists in string. -1 is the output when indexOf can't find the char or string in the parameters
      return true;
   else //if equals anything equal or less than -1 the code will return false
      return false;
	}

	public boolean findSubString(String s)
	{
    if (word.indexOf(s)>-1)//if statement to see if the string in the parameterss exists in string. -1 is the output when indexOf can't find the char or string in the parameters
      return true;
    else
      return false;
	}

 	public String toString() //method to help print (we will talk about this later) 
 	{
 		return word+ "\n\n";
	}
}