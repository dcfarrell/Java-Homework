import java.lang.System;
import java.lang.Math;
import java.util.Arrays;

public class ArrayFunHouseTwo
{
	//goingUp() will return true if all numbers
	//in numArray are in increasing order
	//[1,2,6,9,23] returns true
	//[9, 11, 13, 8]  returns false
	public static boolean goingUp(int[] numArray)
	{
      int count = 0;
      for(int i = 0; i<numArray.length-1; i++)
         {
            if(numArray[i]<numArray[i+1])
             {
               count++;
             }
         }
               
		return count>=numArray.length-1;
	}

	//goingDown() will return true if all numbers
	//in numArray are in decreasing order
	//[31,12,6,2,1] returns true
	//[31, 20, 10, 15, 9] returns false
	public static boolean goingDown(int[] numArray)
	{
		 int count = 0;
      for(int i = 0; i<numArray.length-1; i++)
         {
            if(numArray[i]>numArray[i+1])
             {
               count++;
             }
         }
               
		return count>=numArray.length-1;
	}

	//getValuesBiggerThanX will return an array that contains
	//count number of values that are larter than parameter x
	//[1,2,3,4,5,6,7,8,9,10,11,6],3,5  would return [6,7,8]
	public static int[] getCountValuesBiggerThanX(int[] numArray, int count, int x)
	{
		int limit = 0;
      int i = 0;
      int[] another = new int[count];
      
      while((limit<count) && (i<numArray.length))
         {
         if(numArray[i]>x)
           {
           another[limit] = numArray[i];
           limit++;
           }
         i++;
         }  
         
      return another;
	}
}