package math.model;

public class RecursionTool
{
	public int fibonacciNumber(Integer position)
	{
		//Bounds Check
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		//Base Case
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else 
		{
			return fibonacciNumber(position - 1) + fibonacciNumber(position -2);
		}
	}

	public int factorialNumber(Integer position)
	{
		//Bounds Check
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		//Base Case
		if(position == 0)
		{
			return 1;
		}
		else 
		{
			return position * factorialNumber(position - 1);
		}
	}
}