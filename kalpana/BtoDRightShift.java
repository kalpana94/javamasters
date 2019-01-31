package kalpana;


	
public class BtoDRightShift {
	int [] RightShifter(int[] arr,int noOfShifts)
	{
		int [] arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr2[(i+noOfShifts)%(arr.length)]=arr[i];
		}
		return arr2;
	}

	public static void main(String[] args) {
		
		int [] arr= {4,5,6,7,8};
		BtoDRightShift  s1=new BtoDRightShift ();
		arr=s1.RightShifter(arr,4);
		
		for(int elm:arr)
		{
			System.out.print(elm+" ");
		}
		
	}

}
