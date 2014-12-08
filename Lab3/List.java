//--------------------------------------------------------------------------------------------------------------- 
/*
 * PROGRAM NAME:	List
 * PROGRAMMER:		James Francis
 * CLASS:			CSC-241
 * INSTRUCTOR:		Dr. D. Dunn
 * DATE STARTED:	02/19/14
 * DUE DATE:		02/20/14
 * REFERENCES:		Data Abstraction & Problem Solving with JAVA: Walls and Mirrors, 3rd Ed., Prichard & Carrano
 * 
 * PROGRAM PURPOSE:
 * a. This class implements the Linked List ADT
 * b. Methods to instantiate, access, and modify a List
 * 	
 * Variable List:
 * head - node reference
 * numItems - number of items in a given list
 * 
 * ADTs:
 * Linked List
 */ 
//---------------------------------------------------------------------------------------------------------------


public class List implements ListInterface {
	private Node head;
	private int numItems;

	public List() {
		numItems=0;
		head = null;
	}

	public boolean isEmpty() {
		return numItems == 0;
	}

	public int size() {
		return numItems;
	}

	public Node find(int index){
		//Locates a specified node in a linked list
		//returns a reference to the desired node
		Node cur = head;
		for (int skip = 0; skip <index; skip++){
			cur=cur.next;
		}
		return cur;
	}

	public void add(int index, Object item) throws IndexOutOfBoundsException {

		if (index >=0&& index<numItems+1){
			if (index==0){
				Node newNode = new Node( item, head);
				head = newNode;
			}
			else {

				Node prev = find(index - 1);
				Node newNode= new Node(item, prev.next);
				prev.next = newNode;
			}
			numItems++;
		}
		else{
			throw new IndexOutOfBoundsException("List index out of Bounds on add");
		}
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		if (index >= 0 && index < numItems){
			if (index ==0){
				head = head.next;
			}
			else{
				Node prev = find(index-1);
				Node cur = prev.next;
				prev.next = cur.next;
			}
			numItems--;
		}
		else { 
			throw new IndexOutOfBoundsException("List index out of bounds on remove");
		}
	}

	public Object getItem(int index) throws IndexOutOfBoundsException {

		if	(index>= 0 && index <numItems){
			Node cur = find(index);
			Object dataItem = cur.item;	
			return dataItem;
		}
		else {
			throw new IndexOutOfBoundsException("List index out of Bounds on get");
		}
	}

	@Override
	public void removeAll() {
		head.next = null;
	}
	
	public static void writeList(Node node){
	//writes a list of objects
	if (node != null){
		System.out.println(node.item);
		writeList(node.next);
	}
}

	@Override
	public void add(int index, Student item) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
	}




}
