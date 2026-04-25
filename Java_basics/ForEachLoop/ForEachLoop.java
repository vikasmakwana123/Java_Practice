package Java_basics.ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {
        int nums[]= new int[4];
        nums[0]=10;
        nums[1]=20;
        nums[2]=22;
        nums[3]=123;
        
        for(int n :nums){
            System.out.println(n);
        }
    }
}
