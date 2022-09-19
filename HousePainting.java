import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
	
	// Initialize Scanner 
	Scanner housePainting = new Scanner(System.in);
	
	// COST PER SQUARE FOOT
	
	System.out.print("Please enter the cost per square foot: ");
	double costPerSquarefoot = housePainting.nextDouble();
	System.out.println();
	
	// LENGHT WIDTH AND HEIGHT OF HOUSE 
	
	System.out.print("Please enter the length of the house: ");
	double houseLength  = housePainting.nextDouble();
	System.out.println();
	System.out.print("Please enter the width of the house: ");
	double houseWidth  = housePainting.nextDouble();
	System.out.println();
	System.out.print("Please enter the height of the house: ");
	double houseHeight  = housePainting.nextDouble();
	System.out.println();
	
	//NUMBER OF , LENGTH AND WIDTH OF WINDOWS
	
	System.out.print("Please enter the number of windows: ");
	double windowNum = housePainting.nextDouble();
	System.out.println();
	System.out.print("Please enter the length of a window:");
	double windowLength  = housePainting.nextDouble();
	System.out.println();
	System.out.print("Please enter the width of a window: ");	
	double windowWidth = housePainting.nextDouble();
	System.out.println();
	
	//NUMBER OF  LENGTH AND WIDTH OF DOORS
	System.out.print("Please enter the number of doors: ");
	double doorNum  = housePainting.nextDouble();
	System.out.println();
	System.out.print("Please enter the length of a door:");
	double doorLength  = housePainting.nextDouble();
	System.out.println();
	System.out.print("Please enter the width of a door: ");
	double doorWidth  = housePainting.nextDouble();
	System.out.println();
	
	// SQ OF NORMAL SIDE
	double  normalSide = ((houseLength * houseWidth)) * 2;
	
	// SQ OF PEAK SIDE
	double thePeakside = ((houseLength * houseWidth)+ (.5 * ((houseLength) * (houseHeight - houseWidth)))) * 2;
	
	//WINDOW SQ 
	double windowSQ = ((windowLength * windowWidth)) * windowNum;
	
	// DOOR SQ
	double doorSQ = ((doorLength * doorWidth)) * doorNum;
	
	// DOOR + WINDOW SQ
	double windowAnddoorSQ = (doorSQ + windowSQ);
	
	// HOUSE SQ
	 double houseSQ = (thePeakside + normalSide);
	 
	// TOTAL SQ
	 double totalSQ = (houseSQ - windowAnddoorSQ);
	 
	 //PAINTING COST
	 double paintingCost = (totalSQ * 5);
	 
	 //OUTPUT SQUARE FOOTAGE
	 String oPt1 = String.format("Your total paintable surface area is %.0f square feet.",totalSQ);
	 System.out.println(oPt1);
	 
	 //OUTPUT ESTIMATE
	 String oPt2 = String.format("Your estimate is %.0f dollars.", paintingCost);
	 System.out.println(oPt2);
	  
	 
	 
	 
	 
	 
	 
	
			 

	}

}
