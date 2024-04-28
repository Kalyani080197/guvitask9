package task9;

public class AnnaUniversityGradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int marks = 85; // Assume the marks are out of 100
	        char grade = calculateGrade(marks);
	        System.out.println("The grade is: " + grade);

	}
	
	public static char calculateGrade(int marks) {
		
	   if (marks >= 90 && marks<=99) {
            return 'A';
        } else if (marks >= 80 && marks<=89) {
            return 'B';
        } else if (marks >= 70 && marks <=79) {
            return 'C';
        } else if (marks >= 60 && marks<=69) {
            return 'D';
        } else {
            return 'F';
        }
    }

}
