package circularDoubly;

//import circularDoubly.DoublyListNode;
//import doublyList.DoublyLinkedList;

public class DoublyLinkedList implements SortedLinkedListIntf {
	private DoublyListNode head;
	private DoublyListNode tail;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	
	@Override
	public int[] GetAllElements() {
		int[] listElements;

		listElements = new int[GetNodeCount()];
		int i = 0;
		DoublyListNode curr = head;

		while (curr.next != head) {
			listElements[i] = curr.data;
			++i;
			curr = curr.next;
		
		}
         listElements[i]=curr.data;
		return listElements;
	}

	@Override
	public void Delete(int element) {
		// Set current to first node of list.
		DoublyListNode curr = head;

		// while (current is not empty) do
		while (curr != null) {
			// if currrent node's data is element then
			if (curr.data == element) {
				// end the loop - Found the element to be deleted.
				curr.next.prev=curr.prev;
				curr.prev.next=curr.next;
				break;
				
			}
			curr=curr.next;
		}

		// if current node is empty then
		if (curr == null) {
			// No node to be deleted as element not found OR list is empty.
			// Stop.
			System.out.println("No element to Delete ");
			return;
		}

		// if current node is the first node then
		if (curr == head) {
			// Deleting the first node of linked list
			// Set head to current node's next.
			head = curr.next;

			// if head is empty then
			if (head == null) {
				// List had only one node and that we are to delete => List will be empty.
				// Set tail to empty.
				tail = null;
			} else {
				// List is not empty.
				// Set head node's previous to empty.
				head.prev = null;
			}
			// Stop
			return;
		}

		// if current node is the last node then
		if (curr == tail) {
			// Delete the last node of the linked list.
			// Set (current node's previous) node's next to (current node's next);
			curr.prev.next = curr.next;
			// Set tail to (current node's previous).
			tail = curr.prev;
			// Stop.
			return;
		}

		// Set (current node's previous) node's next to (current node's next).
		curr.prev.next = curr.next;
		// Set (current node's next) node's previous to (current node's previous).
		curr.next.prev = curr.prev;
	}

	public int GetNodeCount() {
		int count = 0;
		DoublyListNode curr = head;

		// Algo: While current is not empty.
		while (curr.next !=head ) {
			++count;
			curr = curr.next;
		}

		return ++count;
	}

	


	@Override
	public void Insert(int element) {
		DoublyListNode newNode = new DoublyListNode(element);
		if(head==null && tail==null) {
			head=newNode;
			//tail=newNode;
			newNode.next=newNode.prev=newNode;
			System.out.println("First node inserted"+head.data);
		}
		else {
			DoublyListNode curr = head;
			if(curr.data>=element) {
				/* while (curr.next != head)
		                curr = curr.next;
				 curr.next = newNode;
		            newNode.next = head;*/
			   newNode.next=head;
			  curr.prev.next=newNode;
				newNode.prev=curr.prev;
				curr.prev=newNode;
				head=newNode;
				System.out.println("next node inserted");
			}
			else {
				while(curr.next!=head &&curr.next.data<element) {//10<30,20<30
					curr=curr.next;	    //10<25,10<25,30<25
					//System.out.println(curr);
				}
					curr.next=newNode;
					newNode.prev=curr;	
					newNode.next=head;
					head.prev=newNode;
					//System.out.println("fgg"+newNode);
					System.out.println("next node inserted");
			}
		}
	}
	public static void main(String[] args) {
		DoublyLinkedList obj = new DoublyLinkedList();
		obj.Insert(20);
		obj.Insert(10);
		obj.Insert(5);
		obj.Insert(3);
		obj.Insert(35);
		obj.Insert(30);//
		int[] list=obj.GetAllElements();
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		obj.Delete(20);
		int[] list1=obj.GetAllElements();
		for(int i=0;i<list1.length;i++) {
			System.out.println(list1[i]);
		}
		
	}
}
