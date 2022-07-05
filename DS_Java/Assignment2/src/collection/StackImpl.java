package collection;

@SuppressWarnings("unchecked")
public class StackImpl<T> implements IStack<T> {

	int size;
	Object[] stack;
	int top;
	
	public StackImpl(int size) {
		this.size=size;
		top=-1;
		stack = (T[]) new Object[size];
		
	}
	
	@Override
	public T pop() {
		if(isEmpty())
			return null;
		return (T)stack[top--];
	}

	@Override
	public void push(T e) {
		if(isFull())
			return;
		stack[++top]=e;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==-1;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return top==size-1;
	}

	@Override
	public T peek() {
		if(isEmpty())
			return null;
		return (T)stack[top];
	}

}
