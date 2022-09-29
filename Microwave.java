
public class Microwave {
	
	// Initializing values for time and power 
	
	private final int INIT_TIME_VAL = 0;
	private final int INIT_POWER_LEVEL = 1;
	
	private int powlevel = INIT_POWER_LEVEL;
	
	private int microTime;
	
	// power() method to take power from 1 to  2 or 2 to  1
		public void power() 
	{
			
			int poweramnt = 1;  
			if (powlevel == INIT_POWER_LEVEL) {
				powlevel = powlevel + poweramnt;
			}
			else if  (powlevel == 2) {
				powlevel = powlevel - poweramnt;}
			System.out.println("Power Button was pressed. Power level is " + powlevel);
	}
		// Reset Method
		public void reset() 
	{
			int powlevel = INIT_POWER_LEVEL;
			int microTime = INIT_TIME_VAL;
			System.out.println("Reset Button was pressed. Power level is "+ powlevel + ". Time is " + microTime+ " seconds." );
			
	}
		// Time method to increment in 30 seconds
		public void time()
	{
			int timeamnt = 30;
			microTime = microTime + timeamnt ;
			
			System.out.println("Time Button was pressed. Time is " + microTime + " seconds");
	}
	
		// method to start the microwave
		public void start() 
		{
			System.out.println("Cooking for "+  microTime +  " seconds at level " + powlevel + ".");
	}
	
	}




