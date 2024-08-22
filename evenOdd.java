import java.util.Arrays;
public class evenOdd
{
   
  public static int[] evenOdd(int[] nums) 
  {
  
  int[] sort = new int[nums.length];
  int a = 0;
  int z = nums.length-1;
  for(int item : nums)
   {
   if(item%2==0)
      {
      sort[a]=item;
      a++;
      }
   if(item%2!=0)
      {
      sort[z]=item;
      z--;
      }
    }
   
   nums = sort;
   
   return nums;
        
  }

   
   public static void main (String[] args)
   {
     System.out.println(Arrays.toString(evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1})));//[2, 5, 3, 6]	    
     System.out.println(Arrays.toString(evenOdd(new int[]{3, 3, 2})));// [2, 1]
     System.out.println(Arrays.toString(evenOdd(new int[]{2, 2, 2})));//[1]
     System.out.println(Arrays.toString(evenOdd(new int[]{3, 2, 2})));//[]	
     System.out.println(Arrays.toString(evenOdd(new int[]{1, 1, 0, 1, 0})));//[1, 2, 2, 4, 1]
     System.out.println(Arrays.toString(evenOdd(new int[]{1})));//[6, 1, 3]
     System.out.println(Arrays.toString(evenOdd(new int[]{1, 2})));//[1, 1, 1]
     System.out.println(Arrays.toString(evenOdd(new int[]{2,2})));//[2, 3, 1]  
     System.out.println(Arrays.toString(evenOdd(new int[]{})));//[]  		    
   }
}

