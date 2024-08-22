public class WordRunner
{
	public static void main(String[] args)
	{
      /*Look at the instructions (Word document) to see what the expected output should look like and make it happen.*/
      /*HINT: You only need to make ONE object*/
      Word line = new Word("chicken");
      System.out.println(line+"\nnum vowels == "+line.getNumVowels()+"\nnum chars == "+line.getLength()+"\n");
      line.setWord("alligator");
      System.out.println(line+"\nnum vowels == "+line.getNumVowels()+"\nnum chars == "+line.getLength()+"\n");
      line.setWord("elephant");
      System.out.println(line+"\nnum vowels == "+line.getNumVowels()+"\nnum chars == "+line.getLength()+"\n");
  	}
}