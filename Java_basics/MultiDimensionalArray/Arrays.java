package Java_basics.MultiDimensionalArray;

public class Arrays {
    public static void main(String[] args) {
        int num[][] = new int[3][4];

        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                //Math.random generates a value that is between 0 and 1 so we multiply it with 10 too get an integer value between 0 and 10
                num[i][j]=(int)(Math.random() * 10);

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" Printing array using enhanced for loop"); 
        
        for(int m[] :num ){
            for (int n : m ){
                System.out.print(n +" ");
            }
            System.out.println();
        }
        

    }
}
