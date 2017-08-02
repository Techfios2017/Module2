
public class static_Nonstatic2 extends Static_nonstatic {

	int t=300;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	food();
	car();
	
	 
	
	
	static_Nonstatic2 x = new static_Nonstatic2();  // instance of a class
	x.food2();
    x.food3();
	System.out.println(x.t);
	x.car2();
	x.car4();
	
	
	
	}




public static void food(){
	
	System.out.println("rice");
	
	
}

public  void food2(){
	
	System.out.println("cake");
	
	
}

public void food3(){
	
	System.out.println("meat");
}


}
