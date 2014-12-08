//--------------------------------------------------------------------------------------------------------------- 
/*
 * PROGRAM NAME:	CourseNode
 * PROGRAMMER:		James Francis
 * CLASS:			CSC-241
 * INSTRUCTOR:		Dr. D. Dunn
 * DATE STARTED:	02/19/14
 * DUE DATE:		02/20/14
 * REFERENCES:		Data Abstraction & Problem Solving with JAVA: Walls and Mirrors, 3rd Ed., Prichard & Carrano
 * 
 * PROGRAM PURPOSE:
 * a. This class is used a definition for a Course object
 * b. Methods to instantiate, access, and modify a Course object
 * 	
 * Variable List:
 * item - Course object
 * next - node object
 */ 
//---------------------------------------------------------------------------------------------------------------
public class CourseNode {

	public Course item;
	public Node next;

	public CourseNode(){
		this.item = null;
		this.next = null;
	}	
	public CourseNode(Course item, Node node){
		this.item = item;
		this.next = node;
	}
}