package Java_basics.Java7Video;

public class WhileLoop {
    public static void main(String[] args) {
        int i =1;
        while (i<=10) {
            System.out.println(i+") Hello World");
            int j=1;
            while (j<=3) {
                System.out.println("        j is equal to "+j);
                j++;
            }
            i++;
        }
    }
}
