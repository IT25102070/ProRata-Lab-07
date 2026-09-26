import java.util.Scanner;

public class IT25102070Lab7Q1B { 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student  );
			System.out.print("Enter marks: ");
			

            int total = 0;
            boolean validInput = false;

            while (!validInput) {
                String line = input.nextLine().trim();
                String[] marks = line.split("\\s+");

                if (marks.length != 4) {
                    System.out.println(" Please enter exactly 4 marks separated by space:");
                    continue;
                }

                try {
                    total = 0;
                    for (String markStr : marks) {
                        int mark = Integer.parseInt(markStr);
                        if (mark < 0 || mark > 100) {
                            throw new NumberFormatException();
                        }
                        total += mark;
                    }
                    validInput = true;

                } catch (NumberFormatException e) {
                    System.out.println(" Invalid input. Enter 4 integers between 0 and 100:");
                }
            }

            double average = total / 4.0;
            System.out.println("Average is: " + average);

           
            if (average >= 75) {
                System.out.println(" Overall Grade is: Distinction");
            } else if (average >= 50) {
                System.out.println("Overall Grade is: Credit");
            } else {
                System.out.println("Overall Grade is: Fail");
            }

            System.out.println(); 
        }

        input.close();
    }
}