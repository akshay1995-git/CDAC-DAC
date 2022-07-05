package stack;

//package org.arpit.java2blog.datastructures;
public class StackImplUsingArray {

static int top=-1;
//static int size=5;
static int[] array=new int[5];
public static boolean isFull() {
	if(top==(array.length)-1) {
		return true;
	}
	else {
		return false;
	}
}
public static void push(int element) {
	if(isFull()) {
		System.out.println("Stack is Full");
	}
	else {
		array[++top]=element;
		
		System.out.println("Element Pushed SuccessFully in stack...");
	}
}
public static Boolean isEmpty()
{
    return top == -1;               // or return size() == 0;
}
public static int pop() {
	if(isEmpty()) {
		System.out.println("Stack is Empty ...!!!");
		return -1;
		
	}
	else {
		int popElement=top;
		--top;
		System.out.println("Element removed From stack "+array[popElement]);
		return array[popElement];
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           push(23);
           push(18);
           push(12);
           push(35);
           push(49);
           push(49);//stack is full
           pop();
           pop();
           pop();
           pop();
           pop();
           pop();//stack is empty.          
	}

}
