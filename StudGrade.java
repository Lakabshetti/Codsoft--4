// Here's a Java program to achieve the described functionality:

// ```java

import java.util.Scanner;

public class StudGrade 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();
        
        // Array to store marks for each subject
        int[] marks = new int[numOfSubjects];
        
        // Reading marks for each subject
        for (int i = 0; i < numOfSubjects; i++) 
        {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        
        // Calculate total marks
        int totalMarks = 0;
        for (int mark : marks)      // for each loop 
        {
            totalMarks += mark;
        }
        
        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numOfSubjects;
        
        // Grade calculation
        char grade;
        if (averagePercentage >= 90) 
        {
            grade = 'A';
        } 
        else if (averagePercentage >= 80) 
        {
            grade = 'B';
        } 
        else if (averagePercentage >= 70) 
        {
            grade = 'C';
        } 
        else if (averagePercentage >= 60) 
        {
            grade = 'D';
        } 
        else 
        {
            grade = 'F';
        }
        
        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}


// This program prompts the user to input the number of subjects and then input the marks obtained in each subject. It calculates the total marks, average percentage, assigns a grade based on the average percentage achieved, and displays the results.