package assignment1;

public class Prog55Diamandpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 3; 

	        
	        for (int i = 1; i <= n; i++) {
	            printSpaces(n - i);
	            printStars(2 * i - 1);
	        }

	        
	        for (int i = n - 1; i >= 1; i--) {
	            printSpaces(n - i);
	            printStars(2 * i - 1);
	        }
	    }

	    
	    static void printSpaces(int count) {
	        for (int i = 1; i <= count; i++) {
	            System.out.print(" ");
	        }
	    }

	    
	    static void printStars(int count) {
	        for (int i = 1; i <= count; i++) {
	            System.out.print("*");
	        }
	        System.out.println(); 
	}

}
