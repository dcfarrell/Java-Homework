public class ArrayFunHouse
{
	//instance variables and constructors could be used, but are not really needed
   private static int count;
	//getSum() will return the sum of the numbers from start to stop, not including stop
   //Use a for loop to traverse the array
	public static int getSum(int[] numArray, int start, int stop)
	{
         int sum = 0;
         for(int i=start; i<stop; i++)
            {
               sum += numArray[i];
            }

      return sum;
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
      count = 0;  
      for(int i=0; i<numArray.length; i++)
         {
             if(numArray[i]==val)
               count++;
               
         }

		return count;
	}
   public static int[] removeVal(int[] numArray, int val)
	{
      int spot = 0;
      int[] hello = new int[numArray.length-getCount(numArray, val)];
         for(int numspot=0; spot<hello.length; numspot++)
            {
               
                   if(numArray[numspot]!=val)
                  { 
                     
                     hello[spot]=numArray[numspot];
                     
                  }
               else
                 {
                     numspot++;
                    
                   if(numArray[numspot]!=val)
                  { 
                     
                     hello[spot]=numArray[numspot];
                     
                  }
                  else
                  spot--;
                 }
               
              spot++;
          }

		return hello;
	}
}