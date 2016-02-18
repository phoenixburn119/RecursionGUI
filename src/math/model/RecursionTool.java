package math.model;

public class RecursionTool
{
	public int getFibNumber(Integer position)
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
			return getFibNumber(position - 1) + getFibNumber(position -2);
		}
	}

	public int getFactorialNumber(Integer position)
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
			return position * getFactorialNumber(position - 1);
		}
	}
}