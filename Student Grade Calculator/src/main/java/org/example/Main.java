package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char grade = 'N';

        Scanner mark = new Scanner(System.in);

        System.out.println("STUDENT GRADE CALCULATOR\n");
        System.out.println("Subjects:\n1.Accounting\n2.History\n3.Mathematics\n4.English");

        try {
            System.out.println("Enter your Accounting mark (out of 100): ");
            int accountingMark = mark.nextInt();

            System.out.println("Enter your History mark (out of 100): ");
            int historyMark = mark.nextInt();

            System.out.println("Enter your Mathematics mark (out of 100): ");
            int mathsMark = mark.nextInt();

            System.out.println("Enter your English mark (out of 100): ");
            int englishMark = mark.nextInt();

            int marksSum = accountingMark + historyMark + mathsMark + englishMark;

            int numSubjects = 4;
            
            double marksAverage = (double) marksSum / numSubjects;

            if(marksAverage >= 80 && marksAverage <= 100) {
                grade = 'A';
            } else if (marksAverage >= 70 && marksAverage < 80) {
                grade = 'B';
            } else if (marksAverage >= 60 && marksAverage < 70) {
                grade = 'C';
            } else if (marksAverage >= 50 && marksAverage < 60) {
                grade = 'D';
            } else if (marksAverage >= 40 && marksAverage < 50) {
                grade = 'E';

            } else if (marksAverage < 40) {
                grade = 'F';
            }

            System.out.println("You have a total mark of " + marksSum + " , an average of " + marksAverage + " and you grade is: " + grade);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer");
        }




    }


}