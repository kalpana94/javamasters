package kalpana;


	class User{
		
		String name;   // Attributes
		              // Property of Object and Not of Class
		String phone;
		String email;
		char gender;
		int age;
		String address;
		
	}
	public class OOPS {
		
	public static void main(String[] args) {
		int a = 10; // SVC
		int[] arr = {10, 20, 30, 40, 50}; // MVC
		
		// Object Construction Statement
		
		User uRef1 = new User();	// MVC
		// arr and uRef1 are not Objects !!
		// arr and uRef1 are Reference Variables !!
		User uRef2 = new User();
        User uRef3 = uRef1; // Reference Copy !!
		
		System.out.println("a is: "+a);
		System.out.println("arr is: "+arr);
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
        
		
		System.out.println("a is: "+a);
		System.out.println("arr is: "+arr);
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		
		uRef2.name = "Jennie";
		uRef2.phone = "+91 88888 88888";
		uRef2.email = "jennie@example.com";
		uRef2.gender = 'F';
		uRef2.age = 28;
		uRef2.address = "Pristine Magnum";
		
		// Update Data in Object
		uRef3.name = "John Watson";
		// Read Data from Object
		System.out.println(uRef1.name+" is "+uRef3.age+" years old");
		System.out.println(uRef2.name+" is "+uRef2.age+" years old");
				
	

	}

}
