public class Course{
	
	String courseName;
	// maximum amount of students for one course
	String students[] = new String[60]; // we can not change the length of an array
	int numberOfStudents = 0;
	
	Course(String newCourseName){
		// creates a course with the specified name
		courseName = newCourseName;
	}
	
	String getCourseName(){
		// returns the course name
		return courseName;
	}
	
	void addStudent(String student){
		// adds a new student to the course
		numberOfStudents++;
		students[numberOfStudents - 1] = student;
	}
	
	void dropStudent(String student){
		// drops a student from the course
		for (int i=0; i<students.length; i++){
			if(student == students[i]){
				for(int j=i; j<students.length-1; j++)
					students[j] = students[j+1];
				students[students.length-1] = null;
				numberOfStudents--;
			}
		}
	}
	
	String[] getStudents(){
		// returns the students in the course
		return students; // returning an array
	}
	
	int getNumberOfStudents(){
		// returns the number of students in the course
		return numberOfStudents;
	}
	
}