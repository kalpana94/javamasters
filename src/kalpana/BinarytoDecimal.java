package kalpana;

public class BinarytoDecimal {

	public static void main(String[] args) {
		int[] [] arr = {
				{1,0,1,0,1},
				{0,0,1,0,1},
				{1,1,1,0,1},
				{1,1,1,0,1},
				{0,0,0,0,1}
		};
		int decimal1 = 0;
		int decimal2 = 0;
		for(int i =0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length-1;j++) {
				if(i==j) {
					decimal1+=arr[i][j]*(int) (Math.pow(2,arr.length-i-1));
					System.out.println(arr[i][j]+"");
					  
				}
			}
		}
		System.out.println(" Decimal->"+decimal1);
		System.out.println();
		
		for(int i =0;i<arr.length;i++) {
			for(int j =arr.length-1;j>=0;j++) {
				if(i+j+1==arr.length) {
					decimal2+=arr[i][j]*(int) (Math.pow(2,arr.length-i-1));
					System.out.println(arr[i][j]+"");
					  
					
					
				}
			}
			
		}
		System.out.println(" Decimal->"+decimal2);
		System.out.println();
		System.out.println("Sum of Decimals: "+(decimal1+decimal2));
 
	}
}


