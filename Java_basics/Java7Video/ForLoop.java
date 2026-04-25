package Java_basics.Java7Video;

public class ForLoop {
    public static void main(String[] args) {
        for(int i =1 ; i<=5;i++){
            System.out.println(i+") Hello World");
            for(int j=1; j<=3; j++){
                System.out.println("        j is equal to "+j);
            }
        }

        for(int i=5;i>=1;i--){
            System.out.println(i+") Hello World");
            for(int j=3; j>=1; j--){
                System.out.println("        j is equal to "+j);
            }
        }
    }
}
/*
int x = 5;

int y = 10;

int z = (x++ > 5 && y-- < 10) ? x-- : y; 

What is the type of the do-while loop in terms of control flow?

*/
