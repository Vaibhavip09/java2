package assignment1;

public class Prog95ZigZagPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rows = 3;
	        int cols = 3;

	        for (int i = 0; i < rows; i++) {
	           
	            if (i == 1) {
	                System.out.print(" ");
	            }

	            for (int j = 0; j < cols; j++) {
	                if (i == 1 && j == 2) {
	                    continue; 
	                }
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	}

}
