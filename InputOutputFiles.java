import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException
   {

		 boolean fileFound = false;
	   	  
		  Scanner input = new Scanner(System.in);
		  
while(fileFound == false) 
	{
			  try {
				  System.out.println("Please enter the path to open the input file for example \\Downloads\\lines.txt : " );
				  String reader = input.nextLine();
				  File inputFile = new File(reader);
			      PrintWriter outputFile = new PrintWriter("/Users/omarahmed/eclipse-workspace/outlines.txt");
			      
				  Scanner in = new Scanner(inputFile);
				  
			      while (in.hasNext()) 
			      {
			     
			    	 String what =in.next();
			    	 outputFile.println(what);
			      }
			      in.close();
			      outputFile.close();
			      System.out.println("Correct File Path!");
			      fileFound = true;
			  }   
		  
		 
		 
		 catch(FileNotFoundException ex){
			 System.out.println("File is not found, please try again");
			 
		 }
	  

   }
}
}