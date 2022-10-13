import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;
public class DonationsTester {

	public static void main(String[] args) throws FileNotFoundException {
		
		//initialzing object
		
		Donations giveToMe = new Donations();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to process donations now? (enter ‘Yes’ to continue): ");
		String inititalPromt = sc.nextLine();
		sc.close();
		
		if(Objects.equals("Yes", inititalPromt)){
			
		
			// Reading Values from Donations File
				File fileReader = new File("Donations.txt");
			     
				// Initialize Scanner for Files
			     Scanner in = new Scanner(fileReader);

			     // While Loop that reads in and separates values
				 while (in.hasNextLine()) {
			    	 String inputVal = in.nextLine();
			    	 String cat = " ";
			    	 if (inputVal.startsWith("<individual")){
			    		 cat = "individual";
			    	 }
			    	 else if(inputVal.startsWith("<business")) {
			    		 cat = "business";
			    	 }
			    	 else if(inputVal.startsWith("<other")) {
			    		 cat = "other";
			    	 }
			    	 else if(inputVal.startsWith("<E")) {
			    		 break;
			    	 }
			    	 
			    // Replacing string with double and parsing
			    inputVal = inputVal.replaceAll("[^0-9,-]","");
		
			    //inputVal = inputVal.replaceAll(" +", " ");
			    double doubleChars = Double.parseDouble(inputVal);
			    giveToMe.processDonation(cat,doubleChars); 
			    
				 }
			// retreiving all values for amount and number 
			giveToMe.getStatistics();
			     }
		else {
		    	System.out.println ("Ending now without processing donations");
		    	System.exit(0);
		    	}
	
	
}

}

