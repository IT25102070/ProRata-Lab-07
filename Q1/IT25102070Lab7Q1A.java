import java.util.Scanner;

public class IT25102070Lab7Q1A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] marks = new int[4];
        int total = 0;

        System.out.println("Enter marks for four subjects:");

        for (int i = 0; i < 4; i++) {

            System.out.print("Enter Subject Mark " + (i + 1) + ": ");
            marks[i] = input.nextInt();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid input. Enter marks between 0 and 100: ");
                marks[i] = input.nextInt();
            }

            total += marks[i];
        }

        double average = total / 4.0;

        System.out.println();
        System.out.println("Average is : " + average);

        if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
        }
        else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
        }
        else {
            System.out.println("Overall Grade is : Fail");
        }

        input.close();
    }
}