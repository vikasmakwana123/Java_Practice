public class Variables {
    public static void main(String[] args) {
        String name="Vikas";
        //int y = a-b; This will give error because a and b are not defined yet.
        int a =29;
        int b =30;

        // System.out.println(y);
        double d =19.6;
        char c ='V';

        boolean isAdult = true;
        float f = 5.6f;

        int sum = a+b;
        int difference = a-b;

        int mul=a*b;
        double div = a/b;


        System.out.println("Name: " + name);
        System.out.println("length: " + a);

        System.out.println("Width: " + b);
        System.out.println("Sum of a+b : " + sum);

        System.out.println("Difference of a-b : " + difference);
        System.out.println("Multiplication of a*b : " + mul);

        System.out.println("Division of a/b : " + div);
        System.out.println("Age: " + d);

        System.out.println("Initial: " + c);
        System.out.println("Is Adult: " + isAdult);
        
        System.out.println("Height: " + f);




    }
}
