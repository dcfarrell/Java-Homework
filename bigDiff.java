public class bigDiff
{
   
   public static int bigDiff(int[] nums) 
   {
    int big = Integer.MIN_VALUE;
    int small = Integer.MAX_VALUE;
    for(int item : nums)
      {
       big = Math.max(big, item);
       small = Math.min(small, item); 
      }
   return big - small;
   }

   
   public static void main (String[] args)
   {
     System.out.println(bigDiff(new int[] {10, 3, 5, 6}));//7 
     System.out.println(bigDiff(new int[] {7, 2, 10, 9}));//8
     System.out.println(bigDiff(new int[] {10,0}));//10
     System.out.println(bigDiff(new int[] {2, 10, 7, 2}));//8
     System.out.println(bigDiff(new int[] {2,10}));//8
     System.out.println(bigDiff(new int[] {2,2}));//0
     System.out.println(bigDiff(new int[] {2}));//0
     
      		    
   }
} 

	     
	    
    
	 