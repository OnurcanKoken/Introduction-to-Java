public class Celsius2Fahrenheit{
	public static void main(String[] args){
		System.out.println("Celsius 35 is Fahrenheit degree");
		System.out.println((9/5)*35+32); // this will cause an error
		System.out.println((9.0/5.0)*35+32);
		System.out.println((9/5.0)*35+32);
		System.out.println((9.0/5)*35+32); // all the same result
	}
}