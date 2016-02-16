package math.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import math.controller.RecursionController;

public class RecursionPanel extends JPanel
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
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(resultsArea);
		resultsArea.setWrapStyleWord(true);
		resultsArea.setLineWrap(true);
		resultsArea.setEditable(false);
		this.setBackground(Color.BLUE);
	}
	
	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, fibonacciButton, 0, SpringLayout.WEST, resultsArea);
		baseLayout.putConstraint(SpringLayout.WEST, resultsArea, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, resultsArea, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, resultsArea, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, factorialButton, 6, SpringLayout.EAST, inputField);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 6, SpringLayout.SOUTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 10, SpringLayout.WEST, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.NORTH, factorialButton, 6, SpringLayout.SOUTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.NORTH, fibonacciButton, 10, SpringLayout.NORTH, this);
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
		
		factorialButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if(checkInput(input))
				{
					resultsArea.append(baseController.doFactorial(input));
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
