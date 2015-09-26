//imports the scanner class to be used in the program
import java.util.Scanner;

public class averageGrade {
    //main method is initialized
    public static void main (String[]args) {
        Scanner scan = new Scanner (System.in);
        //sets the boolean value 'loop' to true
        boolean loop = true;
        //the number of grades entered starts at zero
        int numGrades = 0;
        //the sum of all the grades entered starts at zero
        double total = 0;
        //prompt to enter the first grade
        System.out.println("Input a grade to be averaged: ");
        //value for grade is assigned to the variable 'grade'
        double grade = scan.nextDouble();
        //while loop works if 'loop' is true
        while (loop) {
            //checks if the grade entered is an exceptable value (between 0 and 100)
            if (grade < 0 || grade > 100)
            {
                System.out.println("That is not a valid grade.");
                System.out.println("Grades must be between 0 and 100.");
            }
            //if the grade is valid, that grade is added to the tatal, and 1 is added to 'numGrades' 
            else 
            {
                total = total + grade;
                numGrades++;
            }
            //Just for the benefit of the user, the next two lines of code output the total sum, 
            //and total number of grades enetered up to this point.
            System.out.println("Total sum of grades: " + total);
            System.out.println("Total number of grades added: " + numGrades);
            //prompts the user to enter anoter grade, which is assigned to the variable 'grade', or quit the loop
            System.out.println("To quit and get the average, enter 999. To continue, enter another grade.");
            grade = scan.nextDouble();
            //'loop' is changed to false, ending the loop, if 999 is entered
            if (grade == 999)
            {
                loop = false;
            }
            //otherwise, 'loop' is kept equal to true, and the value enetered is used as the next value for 'grade' in the loop
            else
            {
                loop = true;
            }
            
            
        }
        //Calculates the average of all the grades by dividing the sum of all the grades by the number of grades entered
        double average = total/numGrades;
        //prints out the average.
        System.out.println("The average of the " + numGrades + " valid grade(s) entered is: " + average);
    }
}