package task9;


public class PrintbelowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        int input = 4;
        
        // Variable to keep track of the current number
        int currentNumber = 1;
        
        // Loop to print the pattern
        for (int i = 1; i <= input; i++) {
            // Loop to print each row
            for (int j = 1; j <= i; j++) {
                // Print the current number and increment it
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            // Move to the next line after each row
            System.out.println();
        }
        
        

	}

}
