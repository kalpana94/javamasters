package kalpana;
//application class execution
public class ExampleJava {

	public static void main(String[] args){
		Card c1 = new Card();
		Person p1 = new Person();
		System.out.println("c1 is:"+c1);
		System.out.println("p1 is:"+p1);
		//writing data in card class
		p1.setDataForPerson("kasis",12345,'f');
	//	p1.setDataForPerson("kapil", 82456, 'f');
		c1.setDataForCard(234,567,30-01-2019,p1);
		
	//	c1.pRef = p1;
		c1.showDataForCard();
      //  p1.showDataForPerson();
        // arr is reference variable
        //it will point to int array in heap will all elements as 0
        
        int[] arr = new int[5];
        arr[0] = 101;
         // cRef is a reference variable 
        // it will point to person reference variable 
        Person[] cArr = new Person[4];
        cArr[0] = new Person();
        cArr[1] = new Person();
        cArr[0].setDataForPerson("kavita",2345435,'f');
        cArr[1].setDataForPerson("sunny",45673,'m');
        
        cArr[0].showDataForPerson();
        cArr[1].showDataForPerson();
        
	}

}
