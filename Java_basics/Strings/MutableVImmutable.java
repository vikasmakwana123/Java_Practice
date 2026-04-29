package Java_basics.Strings;

public class MutableVImmutable {
    
    public static void main(String[] args) {

        String s1="Hello";
        String s2="Hello";
        System.out.println(s1==s2); //true because both s1 and s2 are pointing to the same string literal in the string pool
        
        String s3 = "Hello";
        s3 = s3 + " World"; //s3 is now pointing to a new string literal "Hello World" in the string pool
        //here the hello is not changed instead a new string is created in the string pool and stored in thee memory and the s3 points to the new string location in the memory
        //and the older one is then deleted by the garabage collection system


        //String Buffer is Thread safe and String Builder is not thread safe but both are mutable classes in java
        StringBuffer sb = new StringBuffer("Vikas");
        System.out.println("String Buffer capacity:-"+sb.capacity());

        sb.append(" Makwana");
        System.out.println("String Buffer:-"+sb);

        String sb1String= sb.toString();
        System.out.println("String Buffer to String:-"+sb1String);

        sb.deleteCharAt(3);
        System.out.println("String Buffer after delete:-"+sb);

        sb.insert(3, "k");
        System.out.println("String Buffer after insert:-"+sb);

        sb.reverse();
        System.out.println("String Buffer after reverse:-"+sb);



    }
}
