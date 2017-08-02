
public class Local_Global {

	static int x=600;   // Global variable can be called in different function and with extend statement you can call in different classes
	static int t=500;
	static int g=76;
	static int y=90;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Hello();
	name();
	}





public static void Hello(){
	
	
	int a=100;      //local variable- You can use local variable for a specific function only
	int c=200;
	
	
	System.out.println(a);
	System.out.println(x);    //global variable
	System.out.println(t);	 //global variable
    System.out.println(c);
    System.out.println(g);
    System.out.println(y);

}


public static void name (){
	
		int a=100;  //local variable 
		int c=200;  //local variable
	
	System.out.println(a);
	System.out.println(c);
	System.out.println(x);   //global variable
	System.out.println(t);	// global variable
	System.out.println(g);
}







}
