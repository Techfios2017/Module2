import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner reader= new Scanner (System.in);   // scanner object with input argument
	System.out.println(" your name");
	int n =reader.nextInt();                 // reading the input
	System.out.println();
	int p =reader.nextInt();                //reading the input
	int sum=n+p;                             // adding both inputs
	System.out.println("your number is  "+ sum);		
	
	}

}
