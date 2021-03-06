
public class PythagoreanAngles{
	public static void main(String[] args){
		
		// lenght of sides
		double ab = 4;
		double ac = 3;
		double bc = Math.sqrt(ab*ab + ac*ac);
				
		// compute radian
		double aradian = Math.acos((ac*ac-ab*ab-bc*bc)/(-2*bc*ab));
		double bradian = Math.acos((ab*ab-bc*bc-ac*ac)/(-2*bc*ac));
		
		// compute degree
		double adegree = Math.round((Math.toDegrees(aradian))*10)/10.0;
		double bdegree = Math.round((Math.toDegrees(bradian))*10)/10.0;
		// display
		
		System.out.println("alpha = " + Math.rint(aradian*100)/100.0 + ", " + adegree + " degrees");
		System.out.println("beta = " + Math.rint(bradian*100)/100.0 + ", " + bdegree + " degrees");		
	}
}