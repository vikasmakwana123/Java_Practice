
public class Exceptions {
    public static void main(String[] args) {
        //System.out.Println();  Complie Time Error Syntax mis-match

        int i =3;
        int j =22;

        int nums[]= new int [5];
        try {
            j=223/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound");
        }
        catch (Exception e){
            System.out.println("Exception Occured  :- "+e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
