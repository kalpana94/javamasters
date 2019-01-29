package kalpana;

public class ArraySyntaxes {

	public static void main(String[] args) {
		        
		         //1.
				int[] a1 = {10, 20, 30, 40, 50};			// Implicit Statement
				
				//2.
				int a2[] = {10, 20, 30, 40, 50};			// Implicit Statement
				
				//3.
				int[] a3 = new int[]{10, 20, 30, 40, 50};  	// Explicit Statement
						
				//4.
				int a4[] = new int[]{10, 20, 30, 40, 50};   // Explicit Statement
				
				
				// new is an operator which creates Array Dynamically
				// i.e. at Run Time in the HEAP Area of RAM
				// Run Time or Dynamic means when program is in execution phase
				// Compile Time or Static means when program is in compilation phase
				
				//5.
				int[] a5 = new int[10];
				// So an array of 10 integers will be created with all elements as 0
				
				System.out.println("a1[0] is: "+a1[0]); // read operation
				System.out.println("a5[0] is: "+a5[0]);
				
				for(int elm : a5){
					System.out.print(elm+"  ");
				}
				System.out.println();
                int [] a6, a8;
                a6 = new int[10];
                a8 = new int[5];
                
                int [] a7, a9;
                a7 = new int[10];
                a9 = new int[18];
                System.out.println("a6 is:"+a6); // hash code I@15db9742
                System.out.println("a8 is:"+a8); // hash code I@6d06d69c
                System.out.println("a7 is:"+a7); // hash code I@7852e922
                System.out.println("a9 is:"+a9); // hash code I@4e25154f
               
                float[] fArr = {12.22F, 2.3F, 5.67F};
        		char[] cArr = {'A', 'B', 'C'};
        		
              
        		System.out.println("fArr is:"+fArr ); //hash code [F@70dea4e
                System.out.println("cArr is:"+cArr);  //hash code C@5c647e05
				System.out.println("a2 is :"+a2);
				System.out.println("a3 is :"+a3);
				System.out.println("a4 is :"+a4);
				
	}

}
