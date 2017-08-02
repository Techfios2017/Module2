
public class Double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                //r  //c           //r  //c
	String colors [] []= new String [3] [4];
	       
	       //first row
	       colors [0][0]="pink"; 
	       colors [0][1]="purple";
	       colors [0][2]="green";
	       colors [0][3]="orange";
	       
	       // second row	    		  
	       colors [1][0]="yellow"; 
	       colors [1][1]="purple";
	       colors [1][2]="Blue";
	       colors [1][3]="white";
	
	       //Third row
	       colors [2][0]="violoet"; 
	       colors [2][1]="grey";
	       colors [2][2]="red";
	       colors [2][3]="royal blue";
	       
	      
	       
	      
	      
	       // good for small table
	      
	      System.out.println(colors [0] [0]); 
	      System.out.println(colors [0] [1]);
	      System.out.println(colors [0] [2]);
	      System.out.println(colors [0] [3]);
	      System.out.println(colors [1] [0]);
	      System.out.println(colors [1] [1]);
	      System.out.println(colors [1] [2]);
	      System.out.println(colors [1] [3]);
	      System.out.println(colors [2] [0]);
	      System.out.println(colors [2] [1]);
	      System.out.println(colors [2] [2]);
	      System.out.println(colors [2] [3]);
	       
	       //System.out.println(rows);
	       //System.out.println(cols);
	       
	      
	     // Good for big tables
	       
	      int rows=colors.length;
	       int cols=colors[0].length;
	      
	      // argument for rows
	          for (int rownum=0;rownum<rows;rownum++){
	   
	        	  
	        	  //argument for columns
	    	 
	        	  for (int colnum=0;colnum<cols;colnum++){
	    	//argument for printing rows and columns
	    	System.out.println(colors[rownum][colnum]);
	    
	    	
	    	 //System.out.println(" "+ colors[rownum][colnum]);   
	    	   
	    	   
	    	   
	    	   
	    	   //}
	       }
	                  
	
	
	}
	}
	
}


/*String Rainbow []=new String[8];
Rainbow[0]="Yellow";
Rainbow[1]="Red";
Rainbow[2]="Orange";
Rainbow[3]="Green";
Rainbow[4]="Blue";
Rainbow[5]="Indigo";
Rainbow[6]="pink";
Rainbow[7]="black";

for(int y=0; y<Rainbow.length;y++){
	System.out.println(Rainbow[y]);

*/