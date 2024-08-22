public class recursivePalindrome
{
   private static int start, end;
    
   public static boolean isPalindrome(String str)
   {
      removeBlanks(str);
       //recursively check if str is a palindrome
      if(start>=end)
            {
            return true;
            } 

    if(str.substring(start,start+1).equals(str.substring(end,end+1)))
        {
                    start++;
                    end--;
                      return isPalindrome(str);
        
        }
    return false;
   }
   
   
   public static String removeBlanks(String str)
   {
    //recursively remove the spaces in str
    if(str.indexOf(" ")!=-1)
        {
            end--;
            return str.substring(0,str.indexOf(" "))+removeBlanks(str.substring(str.indexOf(" ")+1));
        }
     return str;
   }
   
   
   public static void main (String[] args)
   {
     String[] arr = new String[] {"racecar", "A santa lived as a devil at NASA", "hello world"};
     for(String word: arr)
     {
      start = 0;
      end = word.length()-1;
      System.out.println(isPalindrome(word));

     }
   }
}