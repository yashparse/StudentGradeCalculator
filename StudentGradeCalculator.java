import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask how many subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = input.nextInt();

        int totalMarks = 0;

        // Loop through each subject to get marks
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = input.nextInt();

            // Simple validation to ensure marks are between 0 and 100
            if (marks < 0 || marks > 100) {
                System.out.println("Please enter marks between 0 and 100.");
                i--; // Repeat this subject input
                continue;
            }

            totalMarks += marks;
        }

        // Calculate average percentage
        double average = (double) totalMarks / numberOfSubjects;

        // Determine grade based on average percentage
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the results
        System.out.println("\nTotal Marks: " + totalMarks + "/" + (numberOfSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        input.close();
    }
}
