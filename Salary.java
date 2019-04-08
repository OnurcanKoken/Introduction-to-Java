import java.util.Scanner; // Built-in Scanner class

public class Salary{
	public static void main(String args[]){
		int monthly_salary; // monthly salary
		int annual_income; // annual income
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your monthly salary: ");
		monthly_salary = input.nextInt(); // read from keyboard
		
		annual_income = 12 * monthly_salary;
		System.out.printf("Your annual income is %d\n", annual_income);
	}
}