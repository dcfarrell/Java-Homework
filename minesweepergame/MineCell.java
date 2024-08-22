//complete appropriate methods 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class MineCell extends Cell 
{
	private boolean mine;
   private boolean lose = false;
   private boolean visited = false;
  		
	   public MineCell(int x, int y, int w, int h, boolean mine)
	{
      super(x,y,w,h,mine);      
	}
  

	public void setMined(boolean mine)
	{
      this.mine=mine;
   }

	public boolean getMined()
	{
		return this.mine;
  	}
	public void setLose(boolean lose)
	{
		lose = lose;
	}

		
	public void draw(Graphics window)
	{
   
      //make gray square with black outline
      window.setColor(Color.BLACK);
      window.drawRect(getX(),getY(),getHeight(),getWidth());
      window.setColor(Color.darkGray);
      window.fillRect(getX(),getY(),getHeight(),getWidth());

      if(getMined()) //if the cell is marked as visited
      {
      window.setColor(Color.RED);//replace the gray square with a red square     
      window.fillRect(getX(),getY(),getHeight(),getWidth());
                      
        } 
    }
	
	
	public String toString()
	{
		return super.toString();
	}
}