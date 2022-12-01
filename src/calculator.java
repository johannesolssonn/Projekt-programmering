/**
 * In the class calculator below i call the different metods and prints out input,output and result.
 * @author Johannes Olsson
 */
public class calculator {
    public static void main(String[] args) {
        int choice;
        double num1;
        double num2;

        /**
         *  Calling the metod welcome and the class Output and prints out the texts
         */

        Output.welcome();

        /**
         * Calling and prints out the choice from the metod getOperations and the class Input
         */

        choice = Input.getOperations();
        System.out.println();

        /**
         * calls the metod getNumber and class Input and then prints out first number
         */

        System.out.println("Write your first number");
        num1= Input.getNumber();

        /**
         * calls the metod getNumber and class Input and then prints out Second number
         */

        System.out.println("Write your second number");
        num2= Input.getNumber();

        /**
         * Calls the metod result and class Output and prints out the choice,num1,num2.
         */

        Output.result(choice,num1, num2);

    }
}