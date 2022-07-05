package linkedList;

public class LinkedList implements LinkedListIntf {

	int data;
	LinkedList next;
	LinkedList head;
	LinkedList tail;

	public LinkedList() {
		super();
	}
	/*
	 * public LinkedList(int data, LinkedList next) { super(); this.data = data;
	 * this.next = next; }
	 */

	@Override
	public int AddAtFront(int element) {

		LinkedList node = new LinkedList();
		// node.head=null;
		node.data = element;
		node.next = head;
		head = node;

		System.out.println("Node inserted from Front with data : " + node.data + " " + head);
		return node.data;
	}

	@Override
	public int AddAtRear(int element) {
		LinkedList node = new LinkedList();
		node.next=head;
		// node.next=head;
		while (node.next != null) {
			node = node.next;
		}
		LinkedList newNode = new LinkedList();
		newNode.data = element;
		node.next = newNode;
		System.out.println("Node inserted from rear with data : " + newNode.data + " " + node.next);
		return newNode.data;
	}

	@Override
	public int[] GetAllElements() {
		// ArrayList<LinkedList> list=new ArrayList<LinkedList>();
		LinkedList node = new LinkedList();
		int[] listElements =new int[2];
		node.next = head;
		int i=0;
		while (node.next != null) {
		//	System.out.println("{ " + node.data + " }");
			listElements[i]=node.data;
					++i;
			node = node.next;
		}
		//System.out.println("{ " + node.data + " }");
		// System.out.println();
		// return null;
		return listElements;
	}
	@Override
	public void Delete() {
		LinkedList nodeD=new LinkedList();
		nodeD.next=head;
		while(nodeD.next!=null) {
			//nodeD=nodeD.next;
			//System.out.println(nodeD);
			nodeD=(nodeD.next).next;
		}
		//nodeD=nodeD.next;
		nodeD=null;;
		//tail.next=null;
		System.out.println("Last Node Deleted...!!!");
		
	}
	public static void main(String[] args) {
		LinkedList n = new LinkedList();
		n.AddAtFront(23);
		n.AddAtFront(44);
		n.AddAtRear(12);
		//n.Delete();
		n.AddAtFront(31);
		n.AddAtRear(14);
		n.AddAtRear(100);
	
		n.GetAllElements();
		n.Delete();
		n.GetAllElements();
	}


}
