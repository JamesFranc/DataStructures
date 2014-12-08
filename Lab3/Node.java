//--------------------------------------------------------------------------------------------------------------- 
/*
 * PROGRAM NAME:	Node
 * PROGRAMMER:		James Francis
 * CLASS:			CSC-241
 * INSTRUCTOR:		Dr. D. Dunn
 * DATE STARTED:	02/18/14
 * DUE DATE:		02/20/14
 * REFERENCES:		Data Abstraction & Problem Solving with JAVA: Walls and Mirrors, 3rd Ed., Prichard & Carrano
 * 
 * PROGRAM PURPOSE:
 * a. This class is used a definition for a Course object
 * b. Methods to instantiate, access, and modify a Course object
 * 	
 * Variable List:
 * item - Student object
 * next - node object
 */ 
//---------------------------------------------------------------------------------------------------------------
public class Node {

	public Student item;
	public Node next;

	public Node(){
		this.item = null;
		this.next = null;
	}	
	public Node(Student item, Node node){
		this.item = item;
		this.next = node;
	}
}