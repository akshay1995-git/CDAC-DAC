package doublyList;


public class DoublyLinkedList implements LinkedListIntf {
	private DoublyListNode head;
	private DoublyListNode tail;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void AddAtFront(int element) {
		// Make space for new element, say newNode.
		// Store element in newNode's data.
		// Set newNode's next to empty.
		// Set newNode's previous to empty.
		DoublyListNode newNode = new DoublyListNode(element);

		// if list is empty then
		if (head == null) {
			// Set head and tail to newNode.
			head = newNode;
			tail = newNode;
			// Stop.
			return;
		}

		// Set neWNode's next to head
		newNode.next = head;
		// Set head's previous to newNode
		head.prev = newNode;
		// Set head to newNode
		head = newNode;
	}

	@Override
	public void AddAtRear(int element) {
		// TODO Auto-generated method stub
		DoublyListNode newNode = new DoublyListNode(element);
		if(head==null && tail==null) {
			head=newNode;
			tail=newNode;
		}
		else {

			tail.next=newNode;
		//	newNode.prev=tail;
			tail=newNode;
		}

	}

	@Override
	public int[] GetAllElements() {
		int[] listElements;
/*
		if (head == null) {
			listElements = new int[0];
			return listElements;
		}
*/
		listElements = new int[GetNodeCount()];
		int i = 0;
		DoublyListNode curr = head;

		while (curr != null) {
			listElements[i] = curr.data;
			++i;
			curr = curr.next;
		}

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
				break;
			}
		}

		// if current node is empty then
		if (curr == null) {
			// No node to be deleted as element not found OR list is empty.
			// Stop.
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
		while (curr != null) {
			++count;
			curr = curr.next;
		}

		return count;
	}

	public int[] GetAllElementsInReverseOrder() {
		int i=0;
				int[] listNode=new int[2];
				DoublyListNode curr=tail;
		
		while(curr!=null) {
			listNode[i]=tail.data;
			++i;
			curr=curr.prev;
			
		}
		return listNode;
	}

}

