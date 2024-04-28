package task9;


public class PrintTriangleStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        int input = 5;
        
        // Loop to print the pattern
        for (int i = 1; i <= input; i++) {
            // Check if the current row is the middle row
            if (i == (input / 2) + 1) {
                // Print a single star for the middle row
                System.out.println("*");
            } else {
                // Print two stars for other rows
                System.out.println("* *");
            }
        }       

	}

}
