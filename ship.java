public class ship
{
   private double x;
   private double y;
   private double speed;
   
   public ship()
   {
   x=0.0;
   y=0.0;
   speed=0.0;
   }
   
   public ship(double a,double b)
   {
   x=a;
   y=b;
   }
   
   public ship(double a, double b, double c)
   {
   x=a;
   y=b;
   speed=c;
   }
   
   public boolean equals(ship b)
   {
   return b.x == this.x && b.y == this.y && b.speed == this.speed;
   }
   
   public String toString()
   {
   return x+" + "+y+" + "+speed;
   }
   
   public static void main( String args[] )
   {
   ship one = new ship(2.0,3.0,4.0);
   ship two = new ship(2.0,3.0,4.0);
   System.out.println(one);
   one.equals(two);
   }
   

   
   
}
  