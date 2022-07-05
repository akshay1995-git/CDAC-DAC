package stackList;

//import doublyList.DoublyListNode;

public class DoublyListUsingStack implements IStackList {
	int size;
	int top;
	private DoublyListNode head;
	//private DoublyListNode tail;
	public DoublyListUsingStack() {
	super();	
	head = null;
	size=2;
	top=-1;
	//tail = null;
}

	@Override
	public void addNodeAtTop(int element) {
		
		DoublyListNode newNode=new DoublyListNode(element);
		if(++top<size) {
		if(head==null) {
			
			//tail=newNode;
			newNode.prev=null;
			newNode.next=newNode;
			head=newNode;
			System.out.println("First node inserted in Stack :"+newNode.data);
		}
		else {
			newNode.prev=head;
			head.next=newNode;
			head=newNode;
			System.out.println("Next node inserted in Stack :"+newNode.data);

		}
		}
		else {
			System.out.println("stack is full");
		}
	}
  public int[] getAllNode() {
	  DoublyListNode curr=head;
	  int[] stackList=new int[2];//array size is 2 so stack size is also 2
	  int i=0;
	  while(curr.prev!=null) {
		  //System.out.println(curr.data);
		  stackList[i]=curr.data;
		  curr=curr.prev;
		  ++i;
	  }
	 stackList[i]=curr.data;
	  //curr=curr.prev;
	 // System.out.println(curr.data);
	return stackList;
  }
  public static void main(String[] args) {
	DoublyListUsingStack obj=new DoublyListUsingStack();
	obj.addNodeAtTop(10);
	obj.addNodeAtTop(30);
	
	obj.getAllNode();
}
  
}
