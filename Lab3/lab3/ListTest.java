package lab3;

public class ListTest {
	Node head;
	public ListTest( ) {
        head = new Node();
    }
	
	public boolean isEmpty( ) {
        return head.next == null;
    }
	public static void alphabetizeList(Node head, Node cur){
		cur = head;
		int comparison;
		
		while (cur.next.item != null){
			//System.out.println("We are comparing "+cur.item.getLastName()+" to "+ cur.next.item.getLastName());
			comparison = cur.item.getLastName().compareTo(cur.next.item.getLastName());
			//System.out.println("The item of the comparsion is "+ comparison);
			if (comparison <= 0){
				cur=cur.next;
				
			}
			else if (comparison < 0 ){
				head.next = cur.next;
				cur.next = head;
				head = cur;
				cur = head.next;
				
			}
			else cur = cur.next;
			continue;
		}
		cur = head;
		while (cur.item != null){
			System.out.print(cur.item.getFirstName());
			System.out.print(" "+ cur.item.getLastName()+"\n");
			cur = cur.next;
		}
	}
	
	public static void printList(Node head, Node cur, CourseNode headC){
		//--------------------------------------------------------------------------------------
		//Precondition: Calling code has constructed a linked list. head and cur point to nodes that exist in this list
		//				Additionally headC represents The head node of the Course Linked List within each Student node.
		//Postcondition: All students with their courses have been printed to the console.
		//--------------------------------------------------------------------------------------
				cur = head;
				headC = cur.item.headC;
				while (cur.item != null || cur.item.headC != null){
					
					System.out.println(cur.item.getLastName()+", "+cur.item.getFirstName()+" has taken :");
					System.out.println(cur.item.headC.course.getCourseName()+" with a grade of: "+cur.item.headC.course.getGrade()+" and earned "+cur.item.headC.course.getQualityPoints()+" Quality Points.");
					System.out.println("Their student ID is: " + cur.item.getID()+"\n");

					cur = cur.next;
					if (cur.next != null){
					headC = cur.item.headC;
					}else break;
				}
	}
	
	public static void removeDuplicates(Node head, Node cur, CourseNode headC){
		cur = head;
		if(head == null)
		    return;

		      
		while(cur !=null){
		    Node runner = cur;
		    while(runner.next!=null){
		        if(runner.next.item.getID().equalsIgnoreCase(cur.item.getID()) == true){
		        	System.out.println("Found a duplicate!");
					//cur.item.headC.next = runner.next.item.headC;
		        	runner.next = runner.next.next;
		        }
		        else
		            runner = runner.next;
		    }
		    cur = cur.next;
		}
		/*while (cur.next.item != null){
			
			headC = cur.item.headC;
			System.out.println("The first student is: "+ cur.item.getLastName());
			int idCompare = cur.item.getID().compareTo(cur.next.item.getID());
			if (idCompare == 0 ){
				System.out.println("Found a duplicate!");
				cur.item.headC.next = cur.next.item.headC;
				System.out.println("Moved: "+cur.item.headC.next.course.getCourseName()+" from the duplicate of "+ cur.item.getID()+ " to Primary Student Object");
				
				cur.next.item.headC = null;
				cur = cur.next;
				if (cur.next.next !=null){
					cur = cur.next;

					cur.next = cur.next.next;
				}
				else if( cur.next == null){
					break;
				}
				else cur = cur.next;
			}
			else cur = cur.next;
		*/}
	
	public static int listSize( List list, Node head ) {
        Node check;
        int size = 0;
        
        for( check = head; head !=null; check = check.next )
            size++;
        
        return size;
    }
	
	}
	
