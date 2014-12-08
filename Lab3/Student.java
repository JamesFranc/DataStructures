//--------------------------------------------------------------------------------------------------------------- 
/*
 * PROGRAM NAME:	Student
 * PROGRAMMER:		James Francis
 * CLASS:			CSC-241
 * INSTRUCTOR:		Dr. D. Dunn
 * DATE STARTED:	02/17/14
 * DUE DATE:		02/20/14
 * REFERENCES:		Data Abstraction & Problem Solving with JAVA: Walls and Mirrors, 3rd Ed., Prichard & Carrano
 * 
 * PROGRAM PURPOSE:
 * a. This class is used a definition for a Student object
 * b. Methods to instantiate, access, and modify a Student object
 * 	
 * Variable List:
 * 
 * ADTs:
 * none
 * 
 * FILES USED:
 * none
 * 
 * SAMPLE INPUTS:
 * none
 *
 *SAMPLE OUTPUTS:
 * none
 *
 */ 
//--------------------------------------------------------------------------------------------------------------- 


public class Student {

	private String firstName;
	private String lastName;
	private String idNumber;
	public CourseNode headCourse;
	
	
	
	public Student(){
		//default constructor for the Student class
		setFirstName("TestFirst");
		setLastName("LastTest");
		setID("99999");
		headCourse = null;
	}

	public Student(String f, String l, String i){
		//-----------------------------------------------------------------------------------------------
		//Precondition: The the calling code has sent the following through as parameters:
		// reference f, l, & i have been associated with Strings.
		//
		//Postcondition: A new Student object has been created with supplied information.
		//-----------------------------------------------------------------------------------------------
		setFirstName(f);
		setLastName(l);
		setID(i);
		headCourse = null;
	}

	public void setFirstName(String f){
		this.firstName = f;
	}
	public String getFirstName(){
		return this.firstName;
	}

	public void setLastName(String l){
		this.lastName = l;
	}

	public String getLastName(){
		return this.lastName;
	}
	public void setID(String i){
		this.idNumber = i;
	}
	public String getID(){
		return this.idNumber;
	}
}
