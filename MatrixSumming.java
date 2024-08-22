public class MatrixSumming
{   
    //load in the matrix values
    private int[][] m = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 0},{6, 7, 1, 2, 5},{6, 7, 8, 9, 0},{5, 4, 3, 2, 1}}; 
    private int row;
    private int col;  
    
    //Complete the default constructor method
    public MatrixSumming()
    {
    //int[][] m = new int[0][0];
    row=0;
    col=0;
    }
    
    //Complete the constructor method
    public MatrixSumming(int r, int c)
    {
    //int[][] m = new int[r][c];
    row=r;
    col=c;
    }
  
    //Complete the sum method
    //Think about how your current position in the matrix relates to the surrounding positions
    public int sum( int r, int c )
    {
      int sum = 0;
    	for(int rr = r-1; rr<=r+1; rr++)
         {
         for(int cc = c-1; cc<=c+1; cc++)
            {
            if((rr>-1&&rr<m.length)&&(cc>-1&&cc<m[rr].length))
               {
               sum+=m[rr][cc];
               }
            }
         }
      return sum;

    }
    
    //Complete the code to print out the matrix
    public void printMat()
    {
      System.out.println("Matrix values");
      for(int r = 0; r < m.length; r++)
         {
         for(int c = 0; c < m[r].length; c++)
            {
            System.out.print(m[r][c]+"  ");
            }
         System.out.println();
         }
        System.out.println(); 
    } 
		    
    //Complete the toString method
    public String toString()
    {
      return "The sum of "+row+","+col+" is "+sum(row,col)+".";
    }

}
