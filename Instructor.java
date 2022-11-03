

class Instructor extends Person {
	private double salary = 0; // Initializing instance variable to hold the slaray value 
	
	public  Instructor(String name, int birthYear, double sal) {
		super(name, birthYear);
		setSalary(sal);
	}
	public double setSalary(double salaryParam) { // Method to set the salary 
		this.salary = salaryParam;
		
		return salaryParam;
	}
	 public String toString()
	   {
	      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
	   }

}

