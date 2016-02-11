package math.view;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import math.controller.RecursionController;


public class RecursionPanel
{
	private RecursionController baseController;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea resultsArea;
	private SpringLayout baseLayout;
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		fibonacciButton = new JButton("Calculate the Fibonci number");
		factorialButton = new JButton("n!");
		baseLayout = new SpringLayout();
		inputField = new JTextField(5);
		resultsArea = new JTextArea(10,15);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupLayout()
	{
		
	}
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(resultsArea);
		resultsArea.setWrapSyleWord(true);
		resultsArea.setLineWrap(true);
		this.setBackground(Color,BLUE);
	}
	
	public void setupListeners()
	{
		fibonacciButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if(checkInput(input))
				{
					resultsArea.setText(baseController.doFibonacci(input));
				}
			}
		});
	}
	
	private boolean checkInput(String input)
	{
		boolean isNumber = false;
		
		try
		{
			Integer.parseInt(input);
			isNumber = true;
		}
		catch(Exception numberException)
		{
			resultsArea.setText("You must type in a number");
		}
		return isNumber;
	}
}
