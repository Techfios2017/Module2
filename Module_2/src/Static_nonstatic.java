
public class Static_nonstatic {

	int l=450; // non static global variable 
	int u=430;
	static int t=9; //static global variable
	
	public static void main(String[] args) { //1)Static main function only calls static function, non static is not allowed.
		                                     //2)Non static main function can only take non static function  
		                                     //3)If we want to call non-static function in a static main function we need to create an object

	car();
	
	
	
	//creating and object for car 2 function
	
	Static_nonstatic model= new Static_nonstatic();  // instance for an object can call any non static function and variable
	
	model.car2();  // now calling car 2 function 
	System.out.println(model.l);
	System.out.println(model.u);
	
	
	
	}



public static void car(){       //static function
	
	System.out.println("Mercedez");
	
	
}

public  void car2(){    //non static function
	
	System.out.println("Tesla");
	
}

public void car4(){
	
	System.out.println("bmw");
}


	
}



