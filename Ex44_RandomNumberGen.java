
public class Ex44_RandomNumberGen{
	public static void main(String[] args){
		int i = 1;
		int x = 0;
		int y = 1;
		int found1 = 0;
		int found2 = 0;
		int both = 0;
		int hold1 = 0;
		int hold2 = 0;
		
		while(y == 1){
			
			x = (int)(Math.random()*(-19) + Math.random()*10);
			if (x == 9){
			    System.out.println("Found 9 at " + i);
				if(found1 == 0){
					hold1 = i;
				}
				found1 = 1; // to indicate first found 9
				
			    if (found2 == 1){
					both = 1; // both found
			    }
			}
			if (x == (-18)){
			    System.out.println("Found -18 at " + i);
				if(found2 == 0){
					hold2 = i;
				}
				found2 = 1; // to indicate first found 9
				
			    if (found1 == 1){
					both = 1; // both found
			    }
			}
			if (both == 1){
				break;
			}
			
			i = i + 1;
		} // end while
		
		System.out.println("The first appearance of -18 was at " + hold2);
		System.out.println("The first appearance of 9 was at " + hold1);
		
	}
}