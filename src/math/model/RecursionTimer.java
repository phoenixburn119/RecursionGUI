package math.model;

/**
 * @author akin8529
 * @version 0.1 Feb 16, 2016 Added basic methods and constructor.
 */
public class RecursionTimer
{
	
	private long executionTime;
	
	public RecursionTimer()
	{
		this.executionTime = 0;
	}
	
	public void startTime()
	{
		this.executionTime = System.nanoTime();
	}
	
	public void stopTimer()
	{
		this.executionTime = System.nanoTime() - executionTime;
	}
	
	public void resetTime()
	{
		this.executionTime = 0;
	}

	/**
	 * @return The executionTime value for the CodeTimer object.
	 */
	public long getExecutionTime()
	{
		return executionTime;
	}
	
	public String toString()
	{
		String timeDescription = "Current execution time is: " + this.executionTime + " in nanoseconds.";
		return timeDescription;
	}
	
	
}
