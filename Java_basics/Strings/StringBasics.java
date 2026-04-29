package Java_basics.Strings;

public class StringBasics {
    public static void main(String[] args) {
        String name="Java Programming";
        //Else since the String is a class we can pass the value by creting an object of the String class
        System.out.println("name:-"+ name);
        String name2= new String("java Programing");
        System.out.println("name2:- "+name2);

        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name.concat(" This is concatitaned string"));
    }
}
