package kalpana;
//textual representation of card class

    public class Card {
	//attributes
     int cardNo;
     int cvv;
     int expiryDate;
   //attributes of card object
 	//has a relationship |pRef IS REFERENCE variable of some person object
 	//1 t0 1
 	
     Person pRef;
    
     // methods
     void setDataForCard(int cn,int cv,int ed) {
     cardNo =cn;
	 cvv = cv;
	 expiryDate = ed;
	
   }
     //overloading 
     //redefine the same function with different parameters
     void setDataForCard(int cn,int cv,int ed,Person p) {
         cardNo =cn;
    	 cvv = cv;
    	 expiryDate = ed;
    	 pRef = p;
     }

    void showDataForCard() {
	System.out.println("*****card details********");
	System.out.println("card no is:"+cardNo);
	System.out.println("cvv is:"+cvv);
	System.out.println("expiryDtae is:"+expiryDate);
	System.out.println("***************************");
	System.out.println("*******person details");
	pRef.showDataForPerson();
}
}
