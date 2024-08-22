import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class Minesweeper extends JPanel implements MouseListener
{
	private int mouseX, mouseY;
	private boolean mouseClicked;
	private Grid mineMap;
	private  int rows;
	private  int cols;
   private int[] adj = {-1,0,1};

	public Minesweeper(int numMines, int row, int col)
	{
     	mouseClicked = false;
		rows = row;
      cols = col;
      mineMap = new Grid(rows,cols);
      int i = 0;
      int cnt = numMines;
      
      //randomly load numMines amount of mines into the grid (make sure you address a mine that would be placed on top of another mine)
      //then load the rest of the empty cells 
      
      for(int r = 0; r<mineMap.getNumRows(); r++)
         {
         for(int c = 0; c<mineMap.getNumCols(); c++)
            {
            i = (int)(Math.random()*10)+1;
            if(i>5 && cnt>0)
            {
            mineMap.setSpot(r, c, new MineCell(r*rows,c*cols,19,19,true));
            cnt--;
            }
            else
            {
            mineMap.setSpot(r, c, new EmptyCell(r*rows,c*cols,19,19,false));           
            }
            }
         }
		
      setBackground(Color.white);
		setVisible(true);
      numberOfMines();


		addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e)
	{
		mouseX=e.getX();
		mouseY=e.getY();
		mouseClicked = true;
		repaint();
	}

	public void paintComponent( Graphics window )
	{
		super.paintComponent(window);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		window.setColor(Color.blue);
		window.drawString("Project",420,40);
		window.drawString("MINESWEEPER", 420,55);
		if (mouseClicked)
		{
			int c = mouseY/cols;
			int r = mouseX/rows;        
			play(r,c);
			mouseClicked = false;
		}
		drawMineGrid(window);
	}

	public void drawMineGrid( Graphics window  )
	{
		
		//draw the grid
     mineMap.drawGrid(window);
		
	}

	public void play( int r, int c )
	{
   if(r<rows && c<cols && r>-1 && c>-1 && !mineMap.getSpot(r,c).getMine() && ((EmptyCell)(mineMap.getSpot(r,c))).getVisited())
   {
   ((EmptyCell)(mineMap.getSpot(r,c))).setVisited(true);
   play(r+1,c);
   play(r-1,c);
   play(r,c+1);
   play(r,c-1);
   }
   //recursively reveal empty cells
   //if a mine is clicked, all mines should be revealed
   else if(r<rows && c<cols && r>-1 && c>-1 && mineMap.getSpot(r,c).getMine() && !((MineCell)(mineMap.getSpot(r,c))).getMined())
   {
   ((MineCell)(mineMap.getSpot(r,c))).setMined(true);
   ((MineCell)(mineMap.getSpot(r,c))).setLose(true);
   for(int rr = 0; rr<mineMap.getNumRows(); rr++)//traversing mineMap rows
         {
         for(int cc = 0; cc<mineMap.getNumCols(); cc++)//traversing mineMap columns
            {
            if(mineMap.getSpot(rr,cc).getMine())
               {
               ((MineCell)(mineMap.getSpot(rr,cc))).setMined(true);
               ((MineCell)(mineMap.getSpot(rr,cc))).setLose(true);

               }
            }
          }

   }
   }
   
	public void numberOfMines()
   {
      //count and set the number of surrounding mines for each cell
      int i = 0;
      for(int r = 0; r<mineMap.getNumRows(); r++)//traversing mineMap rows
         {
         for(int c = 0; c<mineMap.getNumCols(); c++)//traversing mineMap columns
            {
         if(!mineMap.getSpot(r,c).getMine())//if spot is empty
            {
              for(int rr = 0; rr<adj.length; rr++)
               {
               for(int cc = 0; cc<adj.length; cc++)
               {
                 if(r+adj[rr]>-1 && r+adj[rr]<mineMap.getNumRows() && c+adj[cc]>-1 && c+adj[cc]<mineMap.getNumCols())
                  {
                   if(mineMap.getSpot(r+adj[rr],c+adj[cc]).getMine())
                     i++;
                  }
               }
              }
           ((EmptyCell)(mineMap.getSpot(r,c))).setCount(i);
           i = 0;
           }
          } 
         }
           
   }
	
	

	public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { }
	public void mousePressed(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }
}
