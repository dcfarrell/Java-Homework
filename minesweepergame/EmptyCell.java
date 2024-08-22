//Fill in appropriate methods
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class EmptyCell extends Cell 
{
	private boolean mine;
   private boolean visited = false;
   private int count;
  		
	public EmptyCell(int x, int y, int w, int h, boolean mine)
	{
   super(x,y,w,h,mine);  
	}

	public void setVisited(boolean visit)
	{
    visited = visit;  
	}
   
   public boolean getVisited()
	{
   return visited;   
	}


	public boolean getMined()
	{
   return this.mine=mine;
	}
   
   public void setCount(int count)
	{
   this.count = count;
	}
   
   public int getCount()
	{
	return count;
	}
   
   public Color cntColor()
   {
   if(getCount()==8)
      return Color.WHITE;
   else if(getCount()==7)
      return Color.PINK;
   else if(getCount()==6)
      return Color.GREEN;
   else if(getCount()==5)
      return Color.RED;
   else if(getCount()==4)
      return Color.YELLOW;
   else if(getCount()==3)
      return Color.BLUE;
   else if(getCount()==2)
      return Color.CYAN;
   
      return Color.WHITE;   
   
	}
		
	public void draw(Graphics window)
	{
   
      //make gray square with black outline
      window.setColor(Color.BLACK);
      window.drawRect(getX(),getY(),getHeight(),getWidth());
      window.setColor(Color.darkGray);
      window.fillRect(getX(),getY(),getHeight(),getWidth());

      if(getVisited())//if the cell is marked as visited
      {
      window.setColor(Color.lightGray); //replace the gray square with a lighter shade of gray and
      window.fillRect(getX(),getY(),getHeight(),getWidth());
      if(getCount()>0)
      {
      window.setColor(cntColor());
      window.drawString(""+getCount(),getX(),getY());//print out the count number on top (make sure you use different colors for each number -- max 8; zeros don't get a number)
      }
     }
       
	}
	public String toString()
	{
		return super.toString();
	}
}