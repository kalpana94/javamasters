package kalpana;

public class Strings {

	public static void main(String[] args) {
		int age = 10;
		int[] arr = {10, 20, 30, 40, 50};
		char[] cArr = {'H','e','l','l','o'};
		
		 // Interned Strings
		 String s1 = "HelLo";
	     String s2 = "Hello";
	      // Object Way
		 String s3 = new String("HeLLo");
		 String s4 = new String("Hello");
		  
		  System.out.println("Age is: "+age); // -> Value
		  System.out.println("arr is: "+arr); // -> HashCode
		  System.out.println("cArr is: "+cArr); // -> HashCode
		  
		  if(s1 == s2){
				System.out.println("s1 == s2");
			}else{
				System.out.println("s1 != s2");
			}
		   if(s3.equalsIgnoreCase(s4)){
				System.out.println("s3 equals s4");
			}else{
				System.out.println("s3 not equals s4");
			}
		   if(s1.compareToIgnoreCase(s2) == 0){
				System.out.println("s1 compared to s2");
			}else{
				System.out.println("s1 not compared to s2");
			}
				
	}

}
