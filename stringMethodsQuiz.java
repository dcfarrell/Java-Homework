//Copy the code you wrote for your quiz and paste it in the appropriate methods below.
//Continue working on the methods that don't work. Use the runner to evaluate your code. 
//When you have finished copy and paste this entire class into the TEXT FIELD in the HUB.

public class stringMethodsQuiz
{
   /*makeOutWord
   Given an "out" string length 4, such as "####", and a word, 
   return a new string where the word is in the middle of the out string.
   
   makeOutWord("####", "Yay") --> "##Yay##"
   makeOutWord("!!##", "WooHoo") --> "!!WooHoo##"
   makeOutWord("[[]]", "word") --> "[[word]]"
   */
   public static String makeOutWord(String out, String word) 
   {
      return out.substring(0,2)+word+out.substring(2);  
   }
   
   /*endsLy
   Given a string, return true if it ends in "ly". 
   The given string could be empty. 
   
   endsLy("oddly") --> true
   endsLy("y") --> false
   endsLy("oddy") --> false
   endsLy("") --> false
   */
   public static boolean endsLy(String str) 
   {
   for(int x = 0; x < str.length(); x++)
      {
      if(str.substring(x).equals("ly"))
         return true;
      }
   return false;
   }
   
   /*conCat
   Given two strings, append them together (known as "concatenation") 
   and return the result. However, if the concatenation creates a double-char, 
   then omit one of the chars, so "abc" and "cat" yields "abcat". Either String 
   could be empty.
   conCat("abc", "cat") --> "abcat"
   conCat("dog", "cat") --> "dogcat"
   conCat("abc", "") --> "abc"
   */
   public static String conCat(String a, String b) 
   {
   
    if(a.equals("") || b.equals(""))
     {  
     return a+b;
     }
      if(a.substring(a.length()-1).equals(b.substring(0,1)))

      {

        return a+b.substring(1);

       }
     
    return a+b;
    
   }
   
   /*catDog
   Return true if the string "cat" and "dog" appear the same number of times in the given string. 
   The given string may be empty.  
   
   catDog("catdog") --> true
   catDog("catcat")--> false
   catDog("1cat1cadodog") --> true
   catDog("ca") --> true
   */
   public static boolean catDog(String str) 
   {
    int c = 0;

     int d = 0;
      for(int x=0; x<str.length()-2; x++)

      {

       if(str.substring(x,x+3).equals("cat"))
       {

         c=c+1;
         }
        if(str.substring(x,x+3).equals("dog"))
         {
         d=d+1;
         }
       } 
   

    return c == d;  
   }
   
   /*repeatEnd
   Given a string and an int N, return a string made of 
   N repetitions of the last N characters of the string. 
   You may assume that N is between 0 and the length of the string,  inclusive.
   The given string may be empty.  
   repeatEnd("Hello", 3) --> "llollollo"
   repeatEnd("Hello", 2) --> "lolo"
   repeatEnd("Hello", 1) --> "o"
   */
   
   public static String repeatEnd(String str, int n) 
   {
   String ing = "";

int m = n;

while(n>0)

   {

     ing = ing + str.substring(str.length()-m, str.length());

     n--;

   }

return ing;    
   }
   
   
}