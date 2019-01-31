package kalpana;

public class Operations {

	public static void main(String[] args) {
		
		int num1 = 110;
		int num2 = 220;
		int num3 = num1 + num2;
		System.out.println(" num3 is : "+num3);
		
		System.out.println("Result is : "+(num1+num2));
		 
		int num4 = num1 % 3;
		System.out.println("num4 is :"+num4); //Arithmetic operators
		
		int num5 = num1 / 3; //division 
		System.out.println("num5 is:"+num5);
		
		int num = 101;
		num++;
		++num;
		--num;
		num--;
		num = 124;
		System.out.println("num is : "+num);
		
		int x = 12;
	    int y = ++x;
	    System.out.println("x is:"+x+" and y is:"+y);
	    
	    int p = 12; //Assignment operators
	    p = p % 3;
	    System.out.println("p is:"+p);
	    
	    int a = 8; // bitwise operators
	    int b = 13;
	    
	    int c = a & b;
	    int d = a | b;
	    int e = a ^ b;
	    System.out.println("c is :"+c);
	    System.out.println("d is :"+d);
	    System.out.println("e is :"+e);
	    
	    // conditional operators
	    int johnsAge = 24;
	    int jenniesAge = 28;
	    int jacksAge = 32;
	    
	    System.out.println("Is john's age Equal to jennies Age? "+(johnsAge != jenniesAge));
	     
	    //logical operators
	    
	    
	   System.out.println("Is jack the oldest? "+((jacksAge > johnsAge) || (jacksAge > jenniesAge)));
	   
	   
	   
	   
	    
	    
	    }

}
