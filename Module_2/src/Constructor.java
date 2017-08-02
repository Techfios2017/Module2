//A constructor is a special method of a class or structure in object-oriented programming that initializes an object of that type.
//A constructor is an instance method that usually has the same name as the class, and can be used to set the values of the members of an object,
//either to default or to user-defined values




public class Constructor {

	 int age;
	 int salary;
	 int house;
     String name;
	
	
 // The purpose of constructor is to re write your default values. 
 //constructor variables always have to be non static. Constructor will get execute first before any function
      
     
     
     
     Constructor()
	{
		
		int age=20;
		int salary=6000;
		int house=2;
		String name="Jack";
		
		System.out.println(age);
		System.out.println(salary);
		System.out.println(house);
		System.out.println(name);
		
		
	}
     
     
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Constructor x = new Constructor();
	
	
	
	
	
	}

}
