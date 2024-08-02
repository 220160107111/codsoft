import java.util.Scanner;

public class GradeCalculator {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Step 1: Input Marks
        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();
        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Step 2: Calculate Total Marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Step 3: Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Step 4: Grade Calculation
        char latter;
        if (averagePercentage >= 90) {
            latter = 'A';
        } else if (averagePercentage >= 80) {
            latter = 'B';
        } else if (averagePercentage >= 70) {
            latter = 'C';
        } else if (averagePercentage >= 60) {
            latter = 'D';
        } else {
            latter= 'F';
        }
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("latter: " +latter);
        sc.close();
    }
    
}
