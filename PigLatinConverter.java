public class PigLatinConverter
{
/**
*Precondition: ch may be an upper or lower-case alphabetic character
*Parameter - ch a single-character string
*Return - true if ch is a vowel, false otherwise
*/
   public boolean isVowel(String ch)
   { 
     /* to be implemented in part (a) */
   return (ch.substring(0,1).equals("a"))||(ch.substring(0,1).equals("A"))||(ch.substring(0,1).equals("e"))||(ch.substring(0,1).equals("E"))||(ch.substring(0,1).equals("i"))||(ch.substring(0,1)== "I")||(ch.substring(0,1).equals("o"))||(ch.substring(0,1).equals("O"))||(ch.substring(0,1).equals("u"))||(ch.substring(0,1).equals("U"));
   }

/**
*Precondition: word is not null and may begin with a vowel 
*              or consonant. You may use isVowel from part a.
*Parameter – word, the word to be converted to Pig Latin
*Return - the Pig Latin form of word
*/
   public String toPig(String word)
   { 
      /* to be implemented in part (b) */
   if(isVowel(word) == true)
   {
   return word+"yay ";
   }
   return word.substring(1)+word.substring(0,1)+"ay ";
   }

/**
	* Precondition:	myLine contains at least one word.
	*			Words are separated by exactly one space.
	*			There is no punctuation in myLine.
	*			You may use toPig from part b.
* Postcondition: myLine has been converted to Pig Latin.
		* 			 Words are separated by one space.
* Return – a string that contains the converted words 

*/
  /* to be implemented in part (c) */

   public String convertLine(String myLine)
   {
   String pig = "";
   int x = 0;

   for(int y = 0; y < myLine.length(); y++)
    {
    if(myLine.substring(y, y + 1).equals(" "))
      {
      x++;
      }
     }
     
   int z = 0;
   
   while(z<x)
    {
    pig = pig + toPig(myLine.substring(0, myLine.indexOf(" ")));
    myLine = myLine.substring(myLine.indexOf(" ")+1);
    z++;
    }
    
   return pig+toPig(myLine);
   }
   
   
}

