package linkedListSort;


public class LinkedListInsertSort {
	int data;
	LinkedListInsertSort next;
	LinkedListInsertSort head;

	public LinkedListInsertSort() {
		super();
	}
		public int AddAtFront(int element) {

		LinkedListInsertSort node = new LinkedListInsertSort();
		// node.head=null;
		if(head==null) {
			node.data=element;
			node.next=null;
			head=node;
		}
		else {
		node.data = element;
		node.next = head;
		head = node;
		}

		System.out.println("Node inserted from Front with data : " + node.data + " " + head);
		return node.data;
	}
		public void GetAllElements() {
			// ArrayList<LinkedList> list=new ArrayList<LinkedList>();
			LinkedListInsertSort node = new LinkedListInsertSort();
			node.next = head;
			while (node.next != null) {
				System.out.println("{ " + node.data + " }");
				node = node.next;
			}
			System.out.println("{ " + node.data + " }");
			// System.out.println();
			// return null;
		}
		void insertionSort(LinkedListInsertSort headref)
	    {
	        // Initialize sorted linked list
			LinkedListInsertSort sorted = null;
	        LinkedListInsertSort current = headref;
	        // Traverse the given linked list and insert every
	        // node to sorted
	        while (current != null)
	        {
	            // Store next for next iteration
	        	LinkedListInsertSort next = current.next;
	            // insert current in sorted linked list
	            //sortedInsert(current);
	            if (sorted == null || sorted.data >= current.data)
	            {
	                current.next = sorted;
	                sorted = current;
	            }
	            else
	            {
	            	LinkedListInsertSort curr = sorted;
	                /* Locate the node before the point of insertion */
	                while (curr.next != null && curr.next.data < current.data)
	                {
	                    curr = curr.next;
	                }
	                current.next = curr.next;
	                curr.next = current;
	            }
	        
	      
	    // Update current
	            current = next;
	        }
	        // Update head_ref to point to sorted linked list
	        head = sorted;
}
	    

		
		public static void main(String[] args) {
			LinkedListInsertSort sort=new LinkedListInsertSort();
			sort.AddAtFront(4);
			sort.AddAtFront(3);
			sort.AddAtFront(5);
			sort.GetAllElements();
			sort.insertionSort(sort.head);
			sort.GetAllElements();
		}
}
