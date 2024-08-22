public class doubleChar
{
   
   public static String doubleChar(String str) 
   {
   String ye = "";
   int x = 0;
   while(x<str.length())
      {
      ye= ye + str.substring(x,x+1)+str.substring(x,x+1);
      x++;
      }
      return ye;
   }	
   
   static public void main (String[] args)
   {
     System.out.println(doubleChar("The"));//TThhee	    
     System.out.println(doubleChar("AAbb"));//AAAAbbbb
     System.out.println(doubleChar("Hi-There"));//HHii--TThheerree
     System.out.println(doubleChar("Word!"));//WWoorrdd!!
     System.out.println(doubleChar("!!"));//!!!!
     System.out.println(doubleChar(""));//*empty string*
     System.out.println(doubleChar("The"));//TThhee	
     System.out.println(doubleChar("a"));//aa				     
   }
   
}

