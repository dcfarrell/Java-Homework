import java.util.Arrays;

public class GoofyNumbers
{
    /** 	@param num is a positive non-decimal value
     *  		Precondition : num >= 0
     *  	@return true if the sum of digits of num is odd 
			@return false if the sum of the digits of num is even
     */
  public static boolean isGoofy(int num)  
  {  
   int sum = 0;
   
   if(num>0)
      {
     while(num>=10)
      {
      while(num>0)
         {
         sum+=num%10;
         num=num/10;
         }
      num = sum;
      sum = 0;
       }
      }
  return num%2!=0;
  
   //**part a implementation**//
   
  }
          
     	
    /* @param count is a positive non-decimal value
     *  		Precondition : count > 0
     *   @return an array containing count Goofy numbers
     */   
  public static int[] getSomeGoofyNumbers(int count)
  {
    int i = 1;
    int d = 0;
    int[] goofy = new int[count];
    
    while(d<count)
      {
      if(isGoofy(i))
         {
         goofy[d]=i;
         d++;
         }
      i++;
      }  
     return goofy;  
       //**part b implementation**//
       
  }	


	public static void main(String args[])
	{
		System.out.println(isGoofy(13));//false
		System.out.println(isGoofy(5));//true
		System.out.println(isGoofy(6));//false
		System.out.println(isGoofy(7654389));//true 
      System.out.println(isGoofy(999999999));//true 
      System.out.println(Arrays.toString(getSomeGoofyNumbers(3)));//[1, 3, 5]
		System.out.println(Arrays.toString(getSomeGoofyNumbers(15)));//[1, 3, 5, 7, 9, 10, 12, 14, 16, 18, 19, 21, 23, 25, 27]

   }
}

