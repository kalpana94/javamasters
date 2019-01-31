package kalpana;

public class BricksProblem {

	public static void main(String[] args) {
		int bricksCount = 0;
		int markBricks = 0;
		
		
         int N = 13;

		for( int johnBricks= 1; johnBricks<N;johnBricks++) {
			
			if(bricksCount>=N) {
				bricksCount = bricksCount - johnBricks;
				System.out.println("wall completed with"+N+" bricks. j placed"+(N-bricksCount) + " brick(s) Lastly");
				break;
			}
		
			
		 
			markBricks =   johnBricks * 2;
		 	bricksCount = bricksCount + markBricks;
			
			if(bricksCount>=N){
				bricksCount = bricksCount - markBricks;
				System.out.println("Wall Complete with "+N+" Bricks. Mark placed "+ (N-bricksCount) + " brick(s) Lastly");
				break;
			}}
			
	}
}	
		

	


