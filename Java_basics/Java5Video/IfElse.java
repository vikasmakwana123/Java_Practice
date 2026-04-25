
public class IfElse {
    public static void main (String[] args){
        int x=12;
        int y = 23;
        int z = 34;
        if(x>y && x>z){
            System.out.println("x is greater than y and z");
        }
        else if (y>x && y>z) {
            System.out.println("y is greater than x and z");
        }
        else if (z>x && z>y) {
            System.out.println("z is greater than x and y");
        }
        else{
            System.out.println("x is equal to y or z ");
        }

    }
}
