package kalpana;

public class Array {

	public static void main(String[] args) {
		// Single Value Containers
				int populationLdh = 12365;
				int populationJal = 23656;
				int populationFzr = 22365;
				int populationAsr = 42365;
				int populationPat = 32365;
				
				int populationCountPunjab = populationLdh + populationJal + populationFzr + populationAsr + populationPat;
				
				System.out.println("Population of Punjab is: "+populationCountPunjab);
				
				// Problem? If we have so many cities, writing code will be complex !!
				// 			When data is highly complex
				// Solution: Arrays !!
				
				int[] populationPunjab = {12365, 23656, 22365, 42365, 32365};
				// populationPunjab is a REFERENCE VARIABLE
				
				System.out.println("populationLdh is: "+populationLdh);
				
				System.out.println("populationPunjab is: "+populationPunjab); // -> [I@15db9742 Memory Reference -> HashCode
				System.out.println("populationPunjab HashCode in Decimal is: "+populationPunjab.hashCode());
				int populationCountPunjab1 = 0;
				for(int population : populationPunjab){
					populationCountPunjab1 = populationCountPunjab1 + population;
				}
				
				System.out.println("Population of Punjab is: "+populationCountPunjab1);
				
	}

	}


