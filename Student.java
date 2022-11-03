
class Student extends Person {
	private String major = " "; // Initializing instance variable to hold the major value 
	
	public String setMajor(String majorParam) { // method to set the major 
		this.major = majorParam;
		return majorParam;
	}
	
	 public String toString()
	 
	   {
	      return "Student[super=" + super.toString() + ",major=" + major + "]";
	   }

}

