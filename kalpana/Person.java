package kalpana;

public class Person {
	//attributes
	String personName;
	int phoneNumber;
	char gender;
	
	//methods
	void setDataForPerson(String pn,int pno,char g) {
		 personName =pn;
		 phoneNumber =pno ;
		 gender = g;
		
	}
	void showDataForPerson() {
		System.out.println("******person details*******");
		System.out.println("personName is:"+personName);
		System.out.println("phone Number is:"+phoneNumber);
		System.out.println("gender is:"+gender);
		System.out.println("*****************************");
		
		
		
	}

}
