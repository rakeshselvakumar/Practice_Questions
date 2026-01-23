import java.util.Scanner;

/*
 * Program Name : marks
 * Purpose      : To find the maximum mark scored in each semester
 * Rules        :
 *  - Marks should be between 0 and 100
 *  - If any invalid mark is entered, print an error message and stop
 */
public class marks {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Read number of semesters
        int semesters = sc.nextInt();

        // Array to store number of subjects in each semester
        int[] subjects = new int[semesters];

        // Read number of subjects for each semester
        for (int i = 0; i < semesters; i++) {
            subjects[i] = sc.nextInt();
        }

        // Loop through each semester
        for (int i = 0; i < semesters; i++) {

            // Initialize max with minimum possible integer value
            int max = Integer.MIN_VALUE;

            // Read marks for subjects in current semester
            for (int j = 0; j < subjects[i]; j++) {

                int mark = sc.nextInt();

                // Check for invalid mark
                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    return; // Stop program execution
                }

                // Update maximum mark if current mark is higher
                if (mark > max) {
                    max = mark;
                }
            }

            // Print maximum mark for the current semester
            System.out.println("Maximum mark in " + (i + 1) + " semester:" + max);
        }

        // Close the scanner to free resources
        sc.close();
    }
}