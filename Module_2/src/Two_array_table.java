
public class Two_array_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Rainbow table
		
		String Rainbow []=new String[8];
		Rainbow[0]="Yellow1";
		Rainbow[1]="Red1";
		Rainbow[2]="Orange1";
		Rainbow[3]="Green1";
		Rainbow[4]="Blue1";
		Rainbow[5]="Indigo1";
		Rainbow[6]="pink1";
		Rainbow[7]="black1";

		

		
		//colors table
		String colors [] []= new String [3] [4];
		       
		       //first row
		       colors [0][0]="Green2"; 
		       colors [0][1]="Black2";
		       colors [0][2]="pink2";
		       colors [0][3]="orange2";
		       
		       // second row	    		  
		       colors [1][0]="yellow2"; 
		       colors [1][1]="purple2";
		       colors [1][2]="Blue2";
		       colors [1][3]="white2";
		
		       //Third row
		       colors [2][0]="violoet2"; 
		       colors [2][1]="grey2";
		       colors [2][2]="red2";
		       colors [2][3]="royal blue2";
	
	
		// logic for printing rainbow table
	   //for(int y=0; y<Rainbow.length;y++){
		//System.out.println(Rainbow[y]);
	
		
		
		
		
		
		//logic for printing color table	
	
		// int rows=colors.length;
	      // int cols=colors[0].length;
	      
	      // argument for rows
	         // for (int rownum=0;rownum<rows;rownum++){
	    //argument for columns
	    	  // for (int colnum=0;colnum<cols;colnum++){
	    	//argument for printing rows and columns
	    	
	    		   //System.out.println(colors[rownum][colnum]);
	
	    	   
	    	//print information from multiple specific table	   
	    	 
		       System.out.println(colors [0] [0]); 
		       System.out.println(Rainbow[2]);
		       
		       System.out.println(colors[1][0]);
		       System.out.println(Rainbow[4]);
	
	
	}

	
	   
	}

