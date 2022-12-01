/**
 *In the class Operations we have four different metods to calculate the different operations
 */
public class Operations {
    /**
     *The metod add makes the calculation of Addition
     * Uses the parameters num1 and num2 to calculate the answer
     * @param num1
     * @param num2
     * @return
     */
    public static double add(double num1, double num2){
        double m;
        m = num1+num2;
        return m;
    }

    /**
     * The metod sub makes the calculation of substraction
     * Uses the parameters num1 and num2 to calculate the answer
     * @param num1
     * @param num2
     * @return
     */
    public  static double sub(double num1, double num2){
        double m;
        m = num1-num2;
        return m;
    }

    /**
     * The metod mul makes the calculation of multiplication
     * Uses the parameters num1 and num2 to calculate the answer
     * @param num1
     * @param num2
     * @return
     */
    public static double mul(double num1, double num2){
        double m;
        m = num1*num2;
        return m;
    }

    /**
     * The metod div makes the calculation of division
     * Uses the parameters num1 and num2 to calculate the answer
     * @param num1
     * @param num2
     * @return
     */
    public static double div(double num1, double num2){
        double m;
        m = num1/num2;
        return m;
    }
}
