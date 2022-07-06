package com.app.org;

public class GrowableStack implements Stack {
	
	private Employee[] stack = new Employee[STACK_SIZE];
	private int top = -1;

	@Override
	public void push(Employee emps) 
	{
		if (top != stack.length-1)
		{ 
			stack[++top] = emps;
		}
		else 
		{ 
			Employee[] temp = stack;
			stack = new Employee[stack.length*2];
			
			for (int i=0; i<=top; i++)
				stack[i] = temp[i];
			
			stack[++top] = emps;
			
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