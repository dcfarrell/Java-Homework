public class parrotTrouble
{
   
   public static boolean parrotTrouble(boolean talking, int hour)
    {
      return talking == true && (hour < 7 || hour > 20);
    }

   
   static public void main (String[] args)
   {
     System.out.println(parrotTrouble(true, 6));//true		    
     System.out.println(parrotTrouble(true, 7)); //false		    
     System.out.println(parrotTrouble(false, 6)); //false		    
     System.out.println(parrotTrouble(true, 21)); //true	
     System.out.println(parrotTrouble(false, 21));//false		    
     System.out.println(parrotTrouble(false, 20)); //false		    
     System.out.println(parrotTrouble(true, 23)); //true		    
     System.out.println(parrotTrouble(false, 23)); //false
     System.out.println(parrotTrouble(true, 20)); //false	    
     System.out.println(parrotTrouble(false, 12)); //false

   }
   
}

