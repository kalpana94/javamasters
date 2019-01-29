package kalpana;

public class ValueVsReference {

	public static void main(String[] args) {
		int a = 10; // single value container
		
		int b = a; // copy operation -> value
		
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		 
		a = 100; // update data in a only
		
		 System.out.println("a is: "+a);
		 System.out.println("b is: "+b);
		  int[] arr1 = {10,20,30,40,50};
		                          
		  // copy operation -> reference
		  int[] arr2 = arr1;
		  System.out.println("arr1 is: "+arr1);
		  System.out.println("arr2 is: "+arr2);
		  arr2[1] = 112;
		  for (int elm : arr1) {
			  System.out.println(elm+" ") ;
		  }
		  
	}

}
