import java.util.Arrays;
public class leftShift
{
   
   public static int[] leftShift(int[] nums) 
   {
   /*
   int[] shift = new int[nums.length];
   int c = 0;
   if(nums.length>0)
   {
   for(int i = 1; i<shift.length; i++)
      {
      shift[c]=nums[i];
      c++;
      }
    shift[c]=nums[0];
   return shift;
   }
   else
   return nums;
   */
   if(nums.length!=0)
   {
   int temp = nums[0];
   for(int i = 1; i<nums.length-1; i++)
      nums[i]=nums[i+1];
   nums[nums.length-1]=temp;
   }
   return nums;
      
   
   
      }

   
   public static void main (String[] args)
   {
     System.out.println(Arrays.toString(leftShift(new int[]{6, 2, 5, 3})));//[2, 5, 3, 6]	    
     System.out.println(Arrays.toString(leftShift(new int[]{1, 2})));// [2, 1]
     System.out.println(Arrays.toString(leftShift(new int[]{1})));//[1]
     System.out.println(Arrays.toString(leftShift(new int[]{})));//[]	
     System.out.println(Arrays.toString(leftShift(new int[]{1, 1, 2, 2, 4})));//[1, 2, 2, 4, 1]
     System.out.println(Arrays.toString(leftShift(new int[]{3, 6, 1})));//[6, 1, 3]
     System.out.println(Arrays.toString(leftShift(new int[]{1, 1, 1})));//[1, 1, 1]
     System.out.println(Arrays.toString(leftShift(new int[]{1, 2, 3})));//[2, 3, 1]    		    
   }
}


