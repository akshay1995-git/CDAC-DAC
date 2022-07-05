package queue;

public class QueueImplUsingArray {
int[] array;
int size;
int front;
int rear;
int currentSize=0;

	public QueueImplUsingArray( int size) {
	super();
	this.size = size;
	this.array = new int[size];
	front=0;
    rear=-1;
    
}
	public boolean isFull() {
		if(rear==size-1)
		return true;
		return false;
	}
public void enqueue(int element) {
	if(isFull()) {
		System.out.println("Queue is OverFlow...!!!");
	}
	else {
		array[++rear]=element;
		currentSize++;
		System.out.println("Element entered in queue SuccessFully...");
	}
}
public boolean isEmpty() {
	if(currentSize==0)
	return true;
	return false;
	
}
public void dequeue() {
	if(isEmpty()) {
		System.out.println("Queue is UnderFlow...!!!");
	}
	else {
		int frontElement=array[front];
		front++;
		currentSize--;
		System.out.println(frontElement+" Value Removed SuccessFully....!!!");
		//return frontElement;
		
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImplUsingArray obj=new QueueImplUsingArray(2);
 obj.enqueue(23);
 obj.enqueue(13);
 obj.enqueue(43);//Queue is OverFlow
 obj.dequeue();
 obj.dequeue();
 obj.dequeue();//Queue is UnderFlow
	}

}
