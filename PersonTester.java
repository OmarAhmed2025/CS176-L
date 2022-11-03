
public class PersonTester
{
   public static void main(String[] args)
   {
      /**
       * p1 is a Person "John" born in 1965
       * p2 is a Person "Mary Ann" born in 1970
       * s1 is a Student "Ann" born in 1982 and is a "Computer Science" major
       * s2 is a Student "Thomas" born in 1986 and is a "Biology" major
       * i1 is an Instructor "Joseph" born in 1954 earning 65000
       * Enter lines of code below to instantiate these objects:
       */
	   
	   // Initializing Objects 
	   Person p1 = new Person();
	   Person p2 = new Person();
	   Student s1 = new Student();
	   Student s2 = new Student();
	   Instructor i1 = new Instructor();
	   
   
	   // Setting the  name and birth Year 
	   
	   p1.setname("John"); p1.setBrithYear(1965);
	   p2.setname("Mary Ann "); p2.setBrithYear(1970);
	   s1.setname("Ann"); s1.setBrithYear(1982);
	   s2.setname("Thomas"); s2.setBrithYear(1986);
	   i1.setname("Joseph"); i1.setBrithYear(1954);
	   
	   //Setting the Major for the students
	   
	   s1.setMajor("Computer Science");
	   s2.setMajor("Biology");
	   
	   // Setting the salary of the instructor
	   
	   i1.setSalary(65000.0);
     
	  System.out.println(p1.toString());
      System.out.println("Expected: Person[name=John,birthYear=1965]");
      System.out.println("");
      
      System.out.println(p2.toString());
      System.out.println("Expected: Person[name=Mary Ann,birthYear=1970]");
      System.out.println("");
      
      System.out.println(s1.toString());
      System.out.println("Expected: Student[super=Person[name=Ann,birthYear=1982],major=Computer Science]");
      System.out.println("");
      
      System.out.println(s2.toString());
      System.out.println("Expected: Student[super=Person[name=Thomas,birthYear=1986],major=Biology]");
      System.out.println("");
      
      System.out.println(i1.toString());
      System.out.println("Expected: Instructor[super=Person[name=Joseph,birthYear=1954],salary=65000.0]");

   }
}
