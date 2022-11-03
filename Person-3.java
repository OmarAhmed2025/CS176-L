
class Person{
	// Initializing instance variables to hold name and brithYear values 
	
	private String name = " ";
	private int  birthYear = 0 ;
	
	
	public  Person(String nam, int year) {
		setname(nam);
		setBrithYear(year); 
	}
	
	public String setname(String nameParam) { // Method to set name value 
		this.name = nameParam;
		return nameParam;
	}
	
	public int setBrithYear(int  bY) { // Method to set birth year value 
		this.birthYear = bY;
		return bY; 
	}
	
	public String toString() {
		
			return "Person[name=" + name + ",birthYear=" + birthYear + "]"; 
	   }
	
		
}


