package kalpana;

class Book{
	 private String title;
	 String author;
	 int price;
	 private int pageCount;
	 String isbn;
	 String publisher;
	 void setTitle(String t) {
		 title = t;
	 }
	 void setPageCount(int p) {
		 if(p< 200) {
			 pageCount = 0;
		 System.out.println("sorry!! we can't accept the book pages less then 200");
		 
	 }else {
		 pageCount = p;
		 
	 }
	 }
	 String getTitle() {
		 return title;
	 }
	 int getPageCount() {
		 return pageCount;
	 } 
	 void showBookDetails() {
		 System.out.println("**********************");
		 System.out.println("Title:/t" +title);
		 System.out.println("Author:/t" +author);
		 System.out.println("Publisher:/t"+publisher);
	     System.out.println("**********************");
		 
	 }
}
	
	

public class OOPSBook {

	public static void main (String[] args) {
		Book bRef1 = new Book();
		Book bRef2 = new Book();
		Book bRef3 = bRef1;
		System.out.println("bRef1 is: "+bRef1);
		System.out.println("bRef2 is: "+bRef2);
		System.out.println("bRef3 is: "+bRef3);
		
		bRef1.setTitle("oracle");
		bRef1.price = 300;
		bRef3.setPageCount(400);
		bRef1.isbn =" SOO4534";
		bRef1.author = "rishi"; 
		bRef1.publisher = "kalyani";
		
		bRef2.setTitle("c++");
		bRef2.price = 400;
		bRef2.setPageCount(350);
		bRef2.isbn = "BOOO1234";
		bRef2.author = "kapil";
		bRef2.publisher = "kalyani";
		
		bRef1.showBookDetails();
		bRef2.showBookDetails();
		
	}
}
		
		
		
	
		



