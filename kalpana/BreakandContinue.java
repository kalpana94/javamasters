package kalpana;

public class BreakandContinue {

	public static void main(String[] args) {
		
		int totalFloors = 10;
		int usersFloor = 1;
		int userDestFloor = 5;
		/*
		for(int elevator=1; elevator<=10; elevator++){
			
			System.out.println("Elevator on Floor# "+elevator);
			
			if(userDestFloor == elevator){
				System.out.println(">>>>> Floor# "+elevator+" Arrived. Thank You !!");
				break; // Terminating the Loop
			}
			
		}
		*//*
		for(int elevator=1; elevator<=10; elevator++){
		
		if(elevator <= userDestFloor){
			continue;
		}
		
		System.out.println("Elevator on Floor# "+elevator);
		
	}*/
		outer:
			for(int i=1; i<=5; i++){
				
				System.out.println("i is: "+i);
				
				inner:
				for(int j=1; j<=5; j++){
					
					if(j>3){
						//break;
						//break inner;
						break outer;
					}
					
					System.out.print(j+" ");
				}
				
				System.out.println();
			}
		

	}

}
