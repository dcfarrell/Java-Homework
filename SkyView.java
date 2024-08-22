import java.util.*;

public class SkyView 
{
	private double[][] view;
	
	/*  Part A */
	public SkyView( int numRows, int numCols, double[] scanned ) 
	{
    view = new double[numRows][numCols];
   int s = 0;
   int c = 0;
   
   for(int r = 0; r<numRows; r++)
      {
      if(c==0)
         {
         while(c<numCols)
            {
            view[r][c]=scanned[s];
            c++;
            s++;
            }
         c--;
         }
      else
         {
         while(c>-1)
            {
            view[r][c]=scanned[s];
            c--;
            s++;
            }
         c++;
         }
       }
	}
	
	/* Part B */
	public double getAverage( int startRow, int endRow, int startCol, int endCol)
	{
    double sum = 0;
    double d = 0;
    
    for(int r = startRow; r<=endRow; r++)
      {
      for(int c = startCol; c<=endCol; c++)
         {
         sum+=view[r][c];
         d++;
         }
       }
		return sum/d;
	}
	
	public String toString()
	{
		String s = "";
		for( double[] row : view )
		{
			for( double item : row )
			{
				s = s + item + " ";
			}
			s = s + "\n";
		}
		return s;
	}    
}