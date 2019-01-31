package kalpana;

public class MethodFrames {
	static void addNumbers(int x , int y) {
		int z = x + y;
		System.out.println("add numbers sum is : "+z);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("sum is :"+c);
		MethodFrames.addNumbers (60,90);
		
		System.out.println("This is Last Statement");

		
	}

}
