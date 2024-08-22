import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	/*
	 *method getListOfFactors will return a list of 
	 *all of the factors of number - excluding number
	 */
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		
      ArrayList factors = new ArrayList<Integer>();

      for(int c = 1; c<number; c++)
         {
         if(number%c==0)
            {
            factors.add(c);
            }
         }
		return factors;
	}
   
   		
      public static void main( String args[] )
	{
		System.out.println(ArrayListFunHouse.getListOfFactors(9));//[1, 3]
      		
		System.out.println(ArrayListFunHouse.getListOfFactors(23));//[1]
		
		System.out.println(ArrayListFunHouse.getListOfFactors(50));//[1, 2, 5, 10, 25]
		
		System.out.println(ArrayListFunHouse.getListOfFactors(100));//[1, 2, 4, 5, 10, 20, 25, 50]
		
		System.out.println(ArrayListFunHouse.getListOfFactors(762));//[1, 2, 3, 6, 127, 254, 381]
	}

   
}