import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

   /*Complete the default constructor method
     Hint: Call the setWords method*/
	public Words()
	{
   setWords("");
	}

   /*Complete the constructor method
     Hint: Call the setWords method*/
	public Words(String wordList)
	{
   setWords(wordList);
	}

   /*setWords should fill the ArrayList with Word objects each of which will contain one word from wordList
    NOTE: Don't forget to initialize the global ArrayList*/
   public void setWords(String wordList)
	{
   words = new ArrayList<Word>();
   String list = wordList;
   while(list.indexOf(" ") != -1)
         {
         words.add(new Word(list.substring(0,list.indexOf(" "))));
         list = list.substring(list.indexOf(" ")+1);
         }
       words.add(new Word(list));

	}
   
	/*countWordsWithXChars should return the number of words in the list that contain size characters*/
	public int countWordsWithXChars(int size)
	{
		int count=0;
      for(Word item : words)
      {
         if(item.getLength()==size)
            count++;
      }

		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
      int count = 0;
      for(int i = words.size()-1; i > -1; i--)
         {
         if(words.get(i).getLength() == size)
            {
            count+=words.get(i).getNumVowels();
            words.remove(i);
            }
         }
		return count;
	}

   /*countWordsWithXVowels should return the number of words in the list that contain numVowels vowels*/
	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
      for(int i = words.size()-1; i>-1; i--)
         {
         if(words.get(i).getNumVowels()==numVowels)
            count++;
         }
		return count;
	}
	
   /*toString will print out the list*/
	public String toString()
	{
	   return ""+words;
	}
}