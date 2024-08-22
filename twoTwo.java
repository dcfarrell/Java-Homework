public class twoTwo
{
   
   public static boolean twoTwo(int[] nums) 
   {
   if(nums.length>0)
   {
    for(int i = 0; i<nums.length-1; i++)
      {
      if(nums[i]==2&&nums[i+1]!=0)
         {
         return false;
         }
       else if(nums[i]==2&&nums[i+1]==2)
         {
         i++;
         }
      }
    }  
    return true;
   }

   
   public static void main (String[] args)
   {
     System.out.println(twoTwo(new int[] {4, 2, 2, 3}));//true	    
     System.out.println(twoTwo(new int[]{2, 2}));//true	
     System.out.println(twoTwo(new int[]{2, 2, 7}));//true
     System.out.println(twoTwo(new int[]{4, 2, 2, 2}));//true	
     System.out.println(twoTwo(new int[]{2, 2, 2}));//true	
     System.out.println(twoTwo(new int[]{}));//true	
     System.out.println(twoTwo(new int[]{1}));//true	
     System.out.println(twoTwo(new int[]{2}));//false	
     System.out.println(twoTwo(new int[]{1, 2, 3, 4}));//false	
     System.out.println(twoTwo(new int[]{2, 2, 7, 2, 1}));//false
     System.out.println(twoTwo(new int[]{1, 2}));//false	    
   }
     
}
