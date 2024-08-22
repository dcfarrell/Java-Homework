public class digitAverage
{
   
   public static int digitAverage(int num) 
   {
    int sum = 0;
    int count = 0;
    while(num>0)
      {
      sum += num%10;
      num/=10;
      count++;
      }
    return sum/count;
   }

   
   public static void main (String[] args)
   {
     System.out.println(digitAverage(456));//5  
     System.out.println(digitAverage(13));//2
     System.out.println(digitAverage(981));//6
     System.out.println(digitAverage(12345));//3 
     System.out.println(digitAverage(4565));//5
     System.out.println(digitAverage(4));//4    		    
   }
} 
