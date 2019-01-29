package kalpana;

public class MultiDimArray {

	public static void main(String[] args) {
		 int a1[] = {10,20,30,40,50}; // 1-D array
		 System.out.println("a1 is:"+a1+" and a1 length is:"+a1.length);
		  int [][]a2 = { 
				  {10,20,30},//0
				  {10,20,30,40,50},// 1       // 2-D ARRAY
				  {10,20},//2
				  {10,20,30,40},//3
				  {10}//4
		  };
		  
		  System.out.println("a2 is:"+a2+" and a2 length is:"+a2.length);
		  for(int i = 0;i< a2.length;i++) {
			 
			  System.out.println("a2["+i+"] is:"+a2[i]+" and a2["+i+"] length is:"+a2[i].length);
		  }
		  // read operation
		 
		  System.out.println("a2[0][1] is:"+a2[0][1]);
		  // write and update operation
		  a2[1][3] = 333;
		  // read all
		  for(int i = 0;i< a2.length;i++) {
			  for(int j = 0;j< a2[i].length;j++) {
				  System.out.println(a2[i][j]+" " );
			  }
			  System.out.println("");
		  }
			  // ARRAY OR ARRAY OF ARRAY
			  int [][][] a3 = {
					  {
							{10, 20, 30},				//0
							{10, 20, 30, 40, 50},		//1
							{10, 20},					//2		// 0
							{10, 20, 30, 40},			//3
							{10}						//4
					  },
					     {
							 {10, 20, 30},				//0
					  
								{10, 20, 30, 40, 50},		//1
								{10, 20},					//2		// 1
								{10, 20, 30, 40},			//3
								{10}						//4
			            
					     }
			        };
			  System.out.println("a3 is: "+a3+" and a3 length is: "+a3.length);
			  System.out.println("a3[0][1] is: "+a3[0][1]+" and a3[0][1] length is: "+a3[0][1].length);
			  System.out.println(a3[0][3][2]); 
				  
		  }
		 
	
	}


