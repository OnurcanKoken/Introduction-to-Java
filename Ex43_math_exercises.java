
public class Ex43_math_exercises{
	public static void main(String[] args){
		
		double x = Math.atan(Math.sin(Math.toRadians(32))*Math.cos(Math.toRadians(32)));
		System.out.println(x);
		
		double y = Math.pow((Math.exp(1.67))*(Math.pow(1.65,(Math.log(8))/(Math.log(20)))),1.0/4);
		System.out.println(y);
		
		double z = (Math.log(Math.pow(21, Math.log(35))))/(Math.log(7));
		System.out.println(z);
		
		double t = Math.exp(Math.sqrt(Math.log(4)) + Math.sqrt(Math.log(5)));
		System.out.println(t);
		
	}
}