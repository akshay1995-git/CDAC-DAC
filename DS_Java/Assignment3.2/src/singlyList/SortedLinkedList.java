package singlyList;

public class SortedLinkedList implements SortedLinkedListIntf {
int data;
SortedLinkedList next;
SortedLinkedList head;
public SortedLinkedList() {
	super();
}
public boolean isEmpty() {
	return (head==null);
}
	@Override
	public void Insert(int element) {
		SortedLinkedList list=new SortedLinkedList();
		if(isEmpty()) {
			list.data=element;
			list.next=head;
			head=list;
			System.out.println("First node inserted "+head);
		}
		else {
			SortedLinkedList newNode=new SortedLinkedList();
			list.next=head;
			while(list.next!=null) {
				if(list.next.data>element) {
					/*int ele=list.next.data;
					list.next.data=element;
					newNode.data=ele;*/
					SortedLinkedList node=list.next;
					list.next=newNode;
			     	newNode=node;
				//	list.data=ele;
				}
			 list=list.next;
				
			}
			System.out.println("Next node insertd : "+list.next);
			
		}
		
	}

	@Override
	public void GetAllElements() {
	SortedLinkedList node=new SortedLinkedList();
		node.next = head;
		while (node.next != null) {
			System.out.println("{ " + node.data + " }");
			node = node.next;
		}
		System.out.println("{ " + node.data + " }");
		// System.out.println();
		// return null;
		//return null;
	}
public static void main(String[] args) {
	SortedLinkedList obj=new SortedLinkedList();
	obj.Insert(23);
	obj.Insert(34);
	obj.Insert(54);
	obj.GetAllElements();
}
}
