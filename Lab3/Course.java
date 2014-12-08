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
 * a. This class is used a definition for a Course object
 * b. Methods to instantiate, access, and modify a Course object
 * 	
 * Variable List:
 * hours - integer, number of hours the course was worth
 * grade - character, the letter grade a student received
 * quality points - integer, the number of quality points a student recieved
 * 
 * ADTs:
 * None
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

public class Course {

	private String courseName;
	private int hours;
	private char grade;
	private int qualityPoints;

	public Course(){

	}

	public Course(String c, int h, char g){
		//-----------------------------------------------------------------------------------------------
		//Precondition: The the calling code has sent the following through as parameters:
		// reference c has been associated with a String, h & g have been assigned values
		//
		//Postcondition: A new Course object has been created with supplied information, and this Course 
		// has been assigned a quality points value based on (hours * grade).
		//-----------------------------------------------------------------------------------------------
		setCourseName(c);
		setHours(h);
		setGrade(g);
		setQualityPoints(h,g);
	}


	public void setCourseName(String c){
		this.courseName = c;
	}

	public String getCourseName(){
		return this.courseName;
	}

	public void setHours(int h){
		this.hours = h;
	}

	public int getHours(){
		return this.hours;
	}

	public void setGrade(char g){
		this.grade = g;
	}

	public char getGrade(){
		return this.grade;
	}

	public void setQualityPoints(int h, char g){
		if (g == 'W' || g== 'w'){
			this.qualityPoints = '\0';
		}else 
			this.qualityPoints = h*convertLetterToPoints(g);
	}

	public int convertLetterToPoints(char g){
		int x = 0;
		switch(g){
		case 'A':
			x = 4;
			break;
		case 'a':
			x = 4;
			break;
		case 'B':
			x = 3;
			break;
		case 'b':
			x = 3;
			break;
		case 'C':
			x = 2;
			break;
		case 'c':
			x = 2;
			break;
		case 'D':
			x = 1;
			break;
		case 'd':
			x = 1;
			break;
		case 'F':
			x = 0;
			break;
		case 'f':
			x = 0;
			break;
		case 'W':
			x = '\0';

			break;
		case 'w':
			x = '\0';
			break;
		}
		//System.out.println("The letter grade "+ g + " equals "+x+" GPA points.\n");
		return x;
	}

	public int getQualityPoints(){
		return this.qualityPoints;
	}
}
