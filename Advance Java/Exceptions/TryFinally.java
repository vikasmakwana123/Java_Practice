
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryFinally {
    public static void main(String[] args) throws IOException {
        int num = 0;
        BufferedReader bf = null;
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);
        } finally {
            System.out.println("Byee closing the program");
            bf.close();

        }

        try(BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));)//try with resources where we do not need to handle the closing of the resources 
         {
            
            
        } finally {
            System.out.println("Byee closing the program");
            bf.close();

        }
    }
}
