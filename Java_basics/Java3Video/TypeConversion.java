package Java_basics.Java3Video;

public class TypeConversion{
    public static void main (String []args){
        byte b= 127;
        int a = b;
        System.out.println("Byte :- "+b);

        int c = 297;
        byte d =(byte)c;
        System.out.println("Int c converted to Byte d :- "+d);

        float f = 23.6f;
        int t = (int)f;
        System.out.println("Float f converted to Int t :- "+t);

        //Type promotion
        byte x = 40;
        byte y = 50;
        int z= x*y;
        System.out.println("Type promotion of byte x and y to int z :- "+z);
        
    }
}