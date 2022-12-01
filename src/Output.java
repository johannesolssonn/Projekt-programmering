public class Output {
    /**
     * In the metod welcome below i store the choices for the user
     */
    public static void welcome() {
        System.out.println("Welcome to the calculator\n");

        System.out.println("Make your choice of operation\n");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division\n");


    }

    /**
     * creates the metod result and uses the parameters to show the result
     * Prints out the result
     * @param choice
     * @param num1
     * @param num2
     */
    public static void result(int choice, double num1, double num2) {


        if (choice == 1) {
            System.out.println("The answer is : " + Operations.add(num1, num2));
        } else if (choice == 2) {
            System.out.println("The answer is : " + Operations.sub(num1, num2));
        } else if (choice == 3) {
            System.out.println("The answer is : " + Operations.mul(num1, num2));
        } else if (choice == 4) {
            System.out.println("The answer is : " + Operations.div(num1, num2));
        }
    }
}
