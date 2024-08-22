public class sum67
{
   
   public static int sum67(int[] nums) 
   {
    int sum = 0;
    for(int i = 0; i<nums.length; i++)
      {
       if(nums[i]!=6)
       {
         sum+=nums[i];
       }
         else
         {
         while(nums[i]!=7)
          {
          i++;
         }
         }
       }
      return sum;
   }
   
   public static void main (String[] args)
   {
     System.out.println(sum67(new int[] {1,2,2}));//5 
     System.out.println(sum67(new int[] {1, 2, 2, 6, 99, 99, 7}));//5 
     System.out.println(sum67(new int[] {1, 1, 6, 7, 2}));//4
     System.out.println(sum67(new int[] {1, 6, 2, 2, 7, 1, 6, 99, 99, 7}));//2
     System.out.println(sum67(new int[] {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}));//2
     System.out.println(sum67(new int[] {6, 8, 1, 6, 7}));//0
     System.out.println(sum67(new int[] {6, 7, 1, 6, 7, 7}));//8
     System.out.println(sum67(new int[] {2, 7, 6, 2, 6, 2, 7}));//9
     System.out.println(sum67(new int[] {2, 7, 6, 2, 6, 7, 2, 7}));//18
     System.out.println(sum67(new int[] {}));//0
      		    
   }
} 
	    
   

	    
    
	    
    
	 