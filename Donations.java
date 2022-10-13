import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Donations {
	// Initializing Value
		private final int  INITVAL  = 0 ; 
		
		private  int numIndividual ; // number of individual donations
		private  int numBusiness ; // number of business donations
		private  int numOther ;// number of other donations
		private  double amntIndividual = INITVAL; // amount of donations ($)
		private  double amntBusiness = INITVAL ;// amount  of donations ($)
		private  double amntOther = INITVAL;// amount of donations ($)
		
		// Method to decrement and Increment Number and Amount of donations
		public void  processDonation(String cat, double donations){
			
			
			if (cat =="individual") {
				amntIndividual  = amntIndividual + donations;
				if (donations > 0) {
				numIndividual +=1 ;
				}
			else {
			 numIndividual -=1;
			}
			
		}
			if (cat == "business") {
				amntBusiness  = amntBusiness + donations;
				if (donations >0 ) {
				numBusiness+=1;
				}
				else {
				numBusiness -=1;
				}
			}
			if (cat=="other") {
				amntOther = amntOther + donations;
				if (donations >0) {
					numOther+=1;
				}
				else {
					numOther -=1;
				}
		}
	}
		// Method to print all statements and statistics 
	public void getStatistics()	{
	System.out.println("Individual: #:" + numIndividual + " $" + amntIndividual);
	System.out.println("Business: #:" + numBusiness+ " $" + amntBusiness);
	System.out.println("Other: #:" + numOther + " $" + amntOther);
		
	}
 
}
	


