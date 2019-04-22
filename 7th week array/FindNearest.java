public class FindNearest{
  public static void main(String args[]) {
	
	double locations [][] = {
		{-1,3}, {-1,-1}, {1,1}, {2,0.5}, {2,-1}, {3,3}, {4,2}, {4,-0.5}		
	};
	
	double nearest = 15.0; double x1 = 0.0; double x2 = 0.0; double y1 = 0.0; double y2 = 0.0;
	double temp = 0.0; double hx1 = 0.0; double hx2 = 0.0; double hy1 = 0.0; double hy2 = 0.0;
	
	int i = 0; int j = 0;
	while(i<=locations.length-2){
		
		for(int k = i; k<=(locations.length - 2); k++){
			
			x1 = locations[i][0]; x2 = locations[k+1][0];
			y1 = locations[i][1]; y2 = locations[k+1][1];
			temp = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			// System.out.println("Temp : " + temp);
			if(temp < nearest) {
				nearest = temp;
				// System.out.println("Nearest : " + temp);
				hx1 = x1; hx2 = x2; hy1 = y1; hy2 = y2; // holding the location
			}
		}
		
		i = i + 1;
		
	}
	
	System.out.println("Here is the location of nearest two points: ");
	System.out.println("(" + hx1 + ")" + "(" + hy1 + ")" + " " + "(" + hx2 + ")" + "(" + hy2 + ")");
	System.out.println("Here is the distance: " + nearest);
  }
}

