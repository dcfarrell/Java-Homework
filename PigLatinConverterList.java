import java.util.ArrayList;
public class PigLatinConverterList
{
   private String myLine;

   public PigLatinConverterList(String str)
   { 
      myLine = str; 
      pigLatin();
   }
   
   /**
   *Precondition: ch may be an upper or lower-case alphabetic character
   *Parameter - ch a single-character string
   *Return - true if ch is a vowel, false otherwise
   */
   public boolean isVowel(String ch)
   { 
     /* should have been implemented in part (a) of original PigLatinConverter Lab; copy it over */
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
      /* should have been implemented in part (b) of original PigLatinConverter Lab; copy it over */
       if(isVowel(word) == true)
           {
            return word+"yay ";
            }
     return word.substring(1)+word.substring(0,1)+"ay ";

   }
   
   /**	Private helper method
	* Precondition:	myLine contains at least one word.
	*			Words are separated by exactly one space.
	*			There is no punctuation in myLine.
	* Postcondition:	myLine is unchanged.
   * @return a list of words in myLine
   */
   private ArrayList<String> getLineWords()
   { 
     ArrayList<String> pig = new ArrayList<String>(); 
      String Line = myLine;
      while(Line.indexOf(" ") != -1)
         {
         pig.add(Line.substring(0,Line.indexOf(" ")));
         Line = Line.substring(Line.indexOf(" ")+1);
         }
       pig.add(Line);
     return pig;       
      /* to be implemented in part (a) */
   }

   /**
   * Mutator method
	* Precondition:	myLine contains at least one word.
	*			Words are separated by exactly one space.
	*			There is no punctuation in myLine.
	* Postcondition:	myLine has been converted to Pig Latin.
	*			The Pig Latin words are separated by one space.
   */
   public void pigLatin()
   { 
      ArrayList<String> original = getLineWords();
      myLine="";   
        
        for(String item : original)
         myLine += toPig(item);
      /* to be implemented in part (b) */           
   }
   
   public String toString()
   { 
     return myLine;
   }
   
   
}

