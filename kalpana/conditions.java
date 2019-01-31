package kalpana;

public class conditions {

	public static void main(String[] args) {

		boolean isInternetConnected = true;
		boolean isGpsConnected = false;
		
		
		if(isInternetConnected) {
			 
			System.out.println("you can browse internet");
			 if(isGpsConnected) {

            System.out.println("you can use google mape to navigate");
			 }else { 
				 System.out.println("please connect to Gps and try again!!");
				 
			 }
			
			
		}else {
			System.out.println("please connect to internet and try again!!");
		}
		System.out.println();
		if(isInternetConnected && isGpsConnected) {
			
			System.out.println("you can browse internet and use maps to navigate");
			
		}else {
			System.out.println("please check your Internet or Gps and try again");
		}
		int num1 = 102;
		int num2 = 102;
		int num3 = 102;
		
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("num1 is greater");
			}else {
				System.out.println("num3 is greater");
			}
		}else {
		      if(num2 > num3) {
		    	  System.out.println("num2 is greater");
		        }  else {
		    		  System.out.println("num3 is greater");
		    	     }
		        }
		System.out.println();
		
		int microcab = 1;
		int minicab = 2;
		int luxurycab = 3;
		int bike = 4;
		int auto = 5;
		
		int userChoice = 4;
		// ladder if else
		if(userChoice == microcab) {
			System.out.println("Micro cab booked !! Arriving soon !!");
		} else if(userChoice == minicab ) {
			     System.out.println("Mini cab booked !! Arriving soon!!");
		}else if(userChoice == luxurycab) {
			System.out.println("Luxury cab booked !! Arriving soon !!");
		}else if(userChoice == bike) {
			System.out.println("Bike is booked !! Arriving soon !!");
		}else if(userChoice == auto) {
			System.out.println("Auto is booked !! Arriving soon !!");
		}else {
			System.out.println("Please choose a valid cab first");
		}
		System.out.println("");
		// switch case
		
		switch (userChoice) {
		          case 1:
			       
		        	  System.out.println("Micro cab booked !! Arriving soon !!");
		        	  break;
		          case 2:
		        	  System.out.println("Mini cab booked !!Arriving soon !!");
		        	  break;
		          case 3:
		        	  System.out.println("luxury cab booked !!Arriving soon !!");
		        	  break;
		          case 4:
		        	  System.out.println("Bike is booked !!Arriving soon !!");
		        	  break;
		          case 5:
		        	  System.out.println("Auto is booked !!Arriving soon !!");
		        	  
		               break;
		          default:
		        	  System.out.println("Please select a valid cab first");
		        	  
		               break;

		             
		
		     
		    	  }
			}
			
			
		

	}


