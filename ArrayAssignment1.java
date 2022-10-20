import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		
		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		
		double max = 0; // initialize max variable to hold value
		int counter = 0;
		
		for (double element : values) {
			// printing each element in the array with a space 
			System.out.print(element + " "); 
			// if statement to check for max value
			if(element > max) {
				max =  element;
			// if statement to check for negative numbers
			}
			if (element < 0) {
				counter++;
		}
	}
	System.out.println();
	System.out.println("The largest element in the array is: " + max);
	System.out.println("There are " + counter + " negative numbers in the array");
	}
}



