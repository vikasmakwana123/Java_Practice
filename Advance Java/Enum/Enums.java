package Enum;

enum Status{
    Running , Failed , Pending , Success;
}

public class Enums {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Running;
        System.out.println(s);
        Status s1 = Status.Pending;
        System.out.println(s.ordinal());//returns 0 becuase postion of running is 0
        System.out.println(s1.ordinal());//returns the postion of that value Example returns 2 because pending  is at place 2

        Status[] s2 = Status.values(); //returns an array 
        for ( Status sss : s2){
            System.out.println(sss+" : "+sss.ordinal());
        }
    }
}
