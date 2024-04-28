package task9;

public class FindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int num1 = 200;
        int num2 = 300;
        int num3 = 100;
        
        // Calculate the largest number among the three
        double largest = num1;
        
        if (num2 > largest) {
            largest = num2;
        }
        
        if (num3 > largest) {
            largest = num3;
        }
        
        // Print the largest number
        System.out.println("The largest number is: " + largest);
        
	}

}
