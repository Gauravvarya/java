package main;

public class Example4{

        public static void main(String[] args) {

            // Variables
            String studentName = "Gaurav";
            int rollNumber = 101;
            String course = "CSE (AI-ML)";

            int javaMarks = 78;
            int pythonMarks = 85;
            int mathMarks = 92;

            // Total and Average
            int totalMarks = javaMarks + pythonMarks + mathMarks;
            double averageMarks = totalMarks / 3.0;

            // Display Student Details
            System.out.println("----- Student Report -----");
            System.out.println("Name: " + studentName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Course: " + course);

            // Display Marks
            System.out.println("\n----- Marks -----");
            System.out.println("Java: " + javaMarks);
            System.out.println("Python: " + pythonMarks);
            System.out.println("Math: " + mathMarks);

            // Display Result
            System.out.println("\nTotal Marks: " + totalMarks);
            System.out.println("Average Marks: " + averageMarks);

            // Grade Calculation
            String grade;

            if (averageMarks >= 90) {
                grade = "A+";
            } else if (averageMarks >= 75) {
                grade = "A";
            } else if (averageMarks >= 60) {
                grade = "B";
            } else {
                grade = "C";
            }

            System.out.println("Grade: " + grade);
        }
    }

