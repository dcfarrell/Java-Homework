public class Sound
{
	/** the array of values in this sound; guaranteed not to be  null */
	private int[] samples;
	
	//Complete the constructor method
   public Sound( int[] vals )
	{
		samples = vals;
	}
	
	
	/** Changes those values in this sound that have an amplitude greater than  limit.
	*	Values greater than  limit are changed to  limit.
	*	Values less than  -limit are changed to  -limit.
	*	@param limit the amplitude limit
	*	Precondition:  limit =  0
	*	@return the number of values in this sound that this method changed  */	
	//PART A
	public int limitAmplitude(int limit)
	{	
		int cnt = 0;
      for(int i = 0; i<samples.length; i++)
         {
         if(samples[i]>limit)
            {
            samples[i]=limit;
            cnt++;
            }
         if(samples[i]<-limit)
            {
            samples[i]=limit;
            cnt++;
            }
         } 
		return cnt;
	}
	
	
	
	/** Removes all silence from the beginning of this sound.
	*	Silence is represented by a value of 0.
	*	Precondition:  samples contains at least one nonzero value
	*	Postcondition: the length of  samples reflects the removal of starting silence  */
	//PART B
	public void trimSilenceFromBeginning()
	{	
   int zero =0;
   int count =0;
   while(samples[zero]==0)
      zero++;
      
   int[] noSilence = new int[samples.length-zero];
   
   for(int i=0; i<noSilence.length; i++)
   {
           noSilence[i]=samples[zero];
           zero++;
              
	}
   samples=noSilence;
	}
   //Should return all items in the array separated by a single space
	public String toString()
	{
      String s = "";
      for(int item : samples)
         s+=item+" ";
         
		return s;
	}
}
