package kalpana;
//application class execution
public class ExampleJava {

	public static void main(String[] args){
		Card c1 = new Card();
		Person p1 = new Person();
		
		//writing data in card class
		c1.setDataForCard(12345, 456, 2020);
		p1.setDataForPerson("kapil", 82456, 'f');
		c1.pRef = p1;
		c1.showDataForCard();

	}

}
