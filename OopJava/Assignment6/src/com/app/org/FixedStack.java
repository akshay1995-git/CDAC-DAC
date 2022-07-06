package com.app.org;

public class FixedStack implements Stack {
	
	private Employee[] stack = new Employee[STACK_SIZE];
	private int top = -1;

	@Override
	public void push(Employee emps) 
	{
		if (top!=STACK_SIZE-1) 
		{ 
			stack[++top] = emps;
		}
		else 
		{ 
			System.out.println("Oops FIXED Stack is FULL");
		}
	}

	@Override
	public Employee pop()
	{
		if (top!=-1) 
		{
			Employee emps = stack[top];
			stack[top--] = null;
			return emps;	
		}
		return null;
	}
}