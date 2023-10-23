class Student
{
	String name;
	static int count;
	int rollno;
	{
	 count++;
	}
	Student(String name, int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	public String toString(){ 
	  return rollno+" "+name;  
	}  
	public static void main (String [] args)
	{
		Student s1 = new Student("Durga",101);
		Student s2 = new Student("Durgai",102);
		Student s3 = new Student("Durgahh",103);
		Student s4 = new Student("Durgakk",104);
		Student s5 = new Student("Durgadd",105);
		Student s6 = new Student("Durgass",106);
		Student s7 = new Student("Durgaww",107);
		System.out.println("no of object created"+ count+" s1-> "+s1+" s2-> "+s2);
	}
	
}