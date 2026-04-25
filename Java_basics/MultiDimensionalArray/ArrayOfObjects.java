package Java_basics.MultiDimensionalArray;
class Student{
    int rollNo;
    String name;
    int marks;

}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo=101;
        s1.name="Karan";
        s1.marks=90;

        Student s2 = new Student();
        s2.rollNo=102;
        s2.name="Rajesh";
        s2.marks=84;

        Student s3 = new Student(); 
        s3.rollNo=103;
        s3.name="Kamlesh";
        s3.marks=79;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        System.out.println(students[0].rollNo);
    }
}
