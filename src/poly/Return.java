package poly;

public class Return {
   int price = 10, discount = 3;  
   private int rate() { 
	   System.out.println("Inside rate() method ");
       return (price-discount); 
   } 
}
