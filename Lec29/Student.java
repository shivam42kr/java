package Lec29;

public class Student {
	
	private String name = "Kaju";
	private int age = 17;  // this value parsing
	
//	this method generate a getter setter directly --> 4 method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		try {   // first keword
		if(age < 0) {
		throw new Exception("bklol age glt hai");   // Exception class ka 
		  //throw method se bahar jane ke liye ...       //   object create
		}
		this.age = age;
		}
		catch (Exception e) {
			// handle exception
			e.printStackTrace(); // line ko trace karega
		}
		finally {
			System.out.println("i am in Finally block");
		}
	}
	
	
//	public void setAge(int age) throws Exception{
//		if(age < 0) {
//		throw new Exception("bklol age glt hai");   // Exception class ka 
//		  //throw method se bahar jane ke liye ...     //    object create
//		}
//		this.age = age;
//	}
	
	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public int getAge() {    // incapsulation method
//		return age;
//	}

}
