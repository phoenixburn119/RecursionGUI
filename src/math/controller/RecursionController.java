package math.controller;

import math.model.RecursionTool;
import math.view.RecursionFrame;

public class RecursionController
{
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	private String calculatedValue;
	
	public RecursionController()
	{
		baseFrame = new RecursionFrame(this);
		mathTool = new RecursionTool();
		calculatedValue = "";
		
	}
	
	public void start()
	{
		
	}
	
	public String doFibonacci(String input)
	{
		calculatedValue = "The Fibonacci sequence at " + input + " is: " + Integer.toString(mathTool.fibonacciNumber(Integer.parseInt(input)));
		return calculatedValue;
	}
	
	public String doFactorial(String input)
	{
		calculatedValue = "! Factorial is: " + Integer.toString(mathTool.factorialNumber(Integer.parseInt(input)));
		return calculatedValue;
	}
}
