public class AtCounter
{
   private String[][] atMat;
   private int count = 0;

	public AtCounter(int rows, int cols)
	{
      int i;
		//size the matrix
      atMat = new String[rows][cols];
      //use nested loops to randomly load the matrix
      //you will need to use Math.random()
     for(int r = 0; r<rows;r++)
      {
      for(int c = 0; c<cols;c++)
         {
         i = ((int)(Math.random()*10)+1);
         if(i>=5)
         {
         atMat[r][c]="@";
         }
         else if(i<5)
         {
         atMat[r][c]="-";
         }
       }
      }
      
	}  

	public int countAts(int r, int c)
	{
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
      if(r > -1 && c > -1 && r<atMat.length && c<atMat[r].length && atMat[r][c].equals("@"))
         {
         atMat[r][c]="-";
        return 1+countAts(r+1,c)+countAts(r,c+1)+countAts(r+1,c)+countAts(r,c+1);
         }
      
      return 0;
      
    }
    
    
    
    
    
	/*
	 *this method will return all values in the matrix
	 *this method should return a view of the matrix
	 *that looks like a matrix
	 */
	public String toString()
	{ 
   String mat = "";
      for(int r = 0; r<atMat.length;r++)
      {
      for(int c = 0; c<atMat[r].length;c++)
         {
         mat+=atMat[r][c]+" ";
         }
      mat+="\n";
      }
  
		return mat;
	}
}