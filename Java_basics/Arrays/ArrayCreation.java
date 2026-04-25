package Java_basics.Arrays;

public class ArrayCreation {
    public static void main(String[] args) {
        int nums[]={2,3,4,8,5};
        System.out.println("The value at index 1 is :- "+nums[1]);

        nums[1]=10;
        System.out.println("The value at index 1 after changing is :- "+nums[1]);

        int num[]=new int[4];//Creating a new array of size 4 without intial values being defined
        
        for(int i =0; i<4;i++){
            System.out.println("The Value of element at index "+i+" is "+num[i]);
        }
        nums[0]=20;
        nums[1]=30;
        nums[2]=40;
        nums[3]=50;

        for(int i =0; i<4;i++){
            System.out.println("The Value of element at index "+i+" after changing is "+num[i]);
        }
    }
}
