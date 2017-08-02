import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//try catch handles exceptions and error.
		
		
try{  // Tries the specific code
		Scanner reader= new Scanner (System.in);   // scanner object with input argument
		System.out.println(" your number");
		int n =reader.nextInt();                 // reading the input
		System.out.println("your number");
		int p =reader.nextInt();                //reading the input
		int divide=n/p;                             // dividing inputs
		System.out.println("your number is  "+ divide);		
	
} catch(Exception e){   // tries to catch every exception. "e" mentions all kind of error
	
	System.out.println("Dont divide by 0 or input any words");
	
}   
	
	
	
	
	}

}
