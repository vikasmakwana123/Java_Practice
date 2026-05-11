package Exceptions;

public class Throw {
    public static void main(String[] args) {
        int i = 0;
        int j = 22;

        try {
            if (i == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            j = 223 / i;
            System.out.println(j);
        } catch (ArithmeticException e) {
            j = 22/1;
            System.out.println("Default Operation applied");
        }
        System.out.println(j);
    }
}
