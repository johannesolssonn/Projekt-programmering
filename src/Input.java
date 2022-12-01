import java.util.Scanner;

/**
 * In the class Input below the program takes the numbers from the user
 */
public class Input {
    /**
     * The metod getOperations takes the input from the user and test it to make sure it is a number
     * and a number between 1-4.
     * @return
     */
    public static int getOperations() {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean isANumber;
        do {
            System.out.println("What would you like to do?: ");
            if (input.hasNextInt()) {
                choice = input.nextInt();
                isANumber = true;
            } else {
                System.out.println("I dont understand you, you need to write a number");
                isANumber = false;
                input.next();
            }
        } while (!(isANumber));
        boolean b = true;
        while (b) {
            if (choice > 4) {
                System.out.println("Write something between 1-4");
                choice = input.nextInt();
            }
            if (choice < 1) {
                System.out.println("Write something between 1-4");
                choice = input.nextInt();
            } else {
                System.out.println();
                b = false;
            }
        }
        return choice;
    }

    /**
     * The metod getNumber takes the input from the user and test that it is a number and not something else.
     * @return
     */
    public static double getNumber() {
        Scanner input = new Scanner(System.in);
        boolean isANumber;
        double num=0;

        do {
            if (input.hasNextDouble()) {
                num = input.nextDouble();
                isANumber = true;
            } else {
                System.out.println(" I dont understand you, you need to write a number");
                isANumber = false;
                input.next();
            }
        } while (!(isANumber));
        return num;

    }
}
