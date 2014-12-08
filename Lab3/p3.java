//--------------------------------------------------------------------------------------------------------------- 
/*
 * PROGRAM NAME:	lab3
 * PROGRAMMER:		James Francis
 * CLASS:			CSC-241
 * INSTRUCTOR:		Dr. D. Dunn
 * DATE STARTED:	02/17/14
 * DUE DATE:		02/20/14
 * REFERENCES:		Data Abstraction & Problem Solving with JAVA: Walls and Mirrors, 3rd Ed., Prichard & Carrano
 * 
 * PROGRAM PURPOSE:
 * a. This program serves as a client to implement and test concepts Linked Lists
 * b. This program will read in a file and instantiate new Student and Course objects, 
 *    then add those to their respective Linked Lists
 * c. This program will then place the students in the list in alphabetical order (A-Z).
 * d. Finally this program will display a report of each student with courses taken, grades earned, and current GPA.
 * Variable List:
 * fileIn - reference variable to the input file.
 * head - Student Node reference variable
 * cur - Student Node Reference variable
 * headC - Course Node reference variable
 * 
 * ADTs:
 * Linked List
 * 
 * FILES USED:
 * p3.dat
 * 
 * SAMPLE INPUTS:
 * Seeplus, Simon                12345 HST225 4 A
 * Martin, Robert                890 CSC210 4 B
 *
 *SAMPLE OUTPUTS:
 * 
 * Martin, Robert
 * Student ID: 890
 * Course Taken - Hours - Grade - Quality Points
 * CSC210         4       B          12

 * The GPA for this course was a 3.00 on a 4 point scale

 * Seeplus, Simon
 * Student ID: 12345
 * Course Taken - Hours - Grade - Quality Points
 * HST225         4       A          16

 * The GPA for this course was a 4.00 on a 4 point scale
 * 

 */ 
//--------------------------------------------------------------------------------------------------------------- 


import java.io.*;
import java.util.*;

public class p3 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner fileIn = new Scanner(new File("src/lab3.dat"));
		Node head, cur;
		List students = new List();
		cur = new Node();
		head = new Node();

		while (fileIn.hasNext()){

			String lastName = fileIn.next();
			String firstName = fileIn.next();
			String idNum = fileIn.next();
			String courseName = fileIn.next();
			int hours = fileIn.nextInt();
			char g = fileIn.next().charAt(0);
			Node newNode = new Node();
			newNode.item = new Student(firstName, lastName.substring(0, (lastName.length()-1)), idNum);
			students.add(0, newNode.item);

			//block of code has newNode.next reference head's current location and then had head point to the new node
			//newNode.next = head;
			//head = newNode;
			//CourseNode newCourseNode = new CourseNode();
			//newCourseNode.item = new Course(courseName, hours, g); 
			//head.item.headCourse = newCourseNode;

		}

		printList(head,cur,students);
	}


	public static void printList(Node head, Node cur, List students){
		//--------------------------------------------------------------------------------------
		//Precondition: Calling code has constructed a linked list. head and cur point to nodes that exist in this list
		//				Additionally headC represents The head node of the Course Linked List within each Student node.
		//Postcondition: All students with their courses have been printed to the console.
		//--------------------------------------------------------------------------------------

		cur = head;
		while(cur.next != null){

			System.out.println("\n"+cur.item.getLastName()+", "+ cur.item.getFirstName());
			System.out.println("Student ID: " +cur.item.getID());
			System.out.println("Course Taken - Hours - Grade - Quality Points");
			System.out.printf("%9s  %8d  %6c  %10d\n",cur.item.headCourse.item.getCourseName(), cur.item.headCourse.item.getHours(), cur.item.headCourse.item.getGrade(), cur.item.headCourse.item.getQualityPoints());
			System.out.printf("\nThe GPA for this course was a %.02f on a 4 point scale\n", (float)cur.item.headCourse.item.getQualityPoints()/cur.item.headCourse.item.getHours());
			if(cur.next != null){
				cur = cur.next;
			}else break;
		}
	}

}


