package com.example;

import java.util.Scanner;

public class App {

    // Method to calculate grade
    public static char calculateGrade(double average) {
        if (average >= 90)
            return 'A';
        else if (average >= 80)
            return 'B';
        else if (average >= 70)
            return 'C';
        else if (average >= 60)
            return 'D';
        else if (average >= 50)
            return 'E';
        else
            return 'F';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = sc.nextDouble();
            total += marks;
        }

        double average = total / subjects;

        char grade = calculateGrade(average);

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}