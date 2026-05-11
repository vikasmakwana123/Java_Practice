class VikasException extends Exception {
    public VikasException(String str) {
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i = 0;
        int j = 22;

        try {
            if (i == 0) {
                throw new VikasException("Cannot divide by zero");
            }
            j = 223 / i;
            System.out.println(j);
        } catch (VikasException e) {
            j = 22 / 1;
            System.out.println("Default Operation applied and Used Custom Exception :- "+ e);
        }
        System.out.println(j);
    }
}
