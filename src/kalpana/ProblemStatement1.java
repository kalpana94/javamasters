package kalpana;
class Product{
	int pid; // attributes  they are property of object and not of class
	String name;
	String brand;
	int price;
}
public class ProblemStatement1 {

	public static void main(String[] args) {
		int a = 10;
		int [] arr = {10,20,30,40};
		 Product pRef = new Product(); // Object Construction Statement
		// pRef is a Reference Variable
		 pRef.pid = 102;
		 pRef.name ="s1";
		 pRef.brand ="samsaung";
         pRef.price = 1000;
         System.out.println("a is:"+a);
         System.out.println("arr is:"+arr);
         System.out.println("pid is:"+pRef.pid);
         System.out.println("name is:"+pRef.name);
         System.out.println("brand is:"+pRef.brand);
         System.out.println("price is:"+pRef.price);

}
}