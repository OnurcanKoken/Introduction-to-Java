public class UseCourse{
	public static void main(String[] args){
		
		
		// write your own main method to test your implementation
		Course c = new Course("Java Programming");
		System.out.println(c.getCourseName());
		c.addStudent("Onur"); c.addStudent("Can"); c.addStudent("Koken");		
		System.out.println("Number of Students: " + c.getNumberOfStudents());
		
		for (int i=0; i<c.getNumberOfStudents(); i++)
			System.out.println(c.getStudents()[i]);
		
		c.dropStudent("Can");
		System.out.println("After deleting one student, ");
		for (int i=0; i<c.getNumberOfStudents(); i++)
			System.out.println(c.getStudents()[i]);
		System.out.println("Number of Students: " + c.getNumberOfStudents());
		
		/*
		TV2 tv = new TV2(60,5);
		tv.turnToggle(); tv.gotoPreviousChannel();
		System.out.println(tv.getState());
		tv.setChannel(75); tv.channelUp(); tv.channelUp();
		tv.volumeUp(); tv.gotoPreviousChannel();
		System.out.println(tv.getState());
		tv.turnToggle();
		tv.setVolume(2); tv.volumeDown(); tv.volumeDown();
		tv.channelDown(); tv.channelDown();
		tv.gotoPreviousChannel();
		System.out.println(tv.getState());
		*/
	}
}