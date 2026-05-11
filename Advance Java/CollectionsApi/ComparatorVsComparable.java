
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
    public int compareTo(Student that){
        if(this.age>that.age)
                return 1;
            else
                return -1;
    }

}


public class ComparatorVsComparable {
public static void main(String[] args) {

    Comparator<Integer> com = new Comparator<Integer>(){
        public int compare(Integer i , Integer j){
            if(i%10>j%10)
                return 1;
            else
                return -1;
        }
    };
    List<Integer> nums = new ArrayList<>();
    nums.add(43);
    nums.add(22);
    nums.add(51);
    nums.add(79);
    Collections.sort(nums,com);//This is used to sort numbers in an array list we have passed a custom comparator in our sorting that sort based on the unit place numbers
    System.out.println(nums);


    Comparator<Student> com2 = (Student i , Student j)->{
            if(i.age>j.age)
                return 1;
            else
                return -1;
        
    };
    List<Student> students = new ArrayList<>();
    students.add(new Student(20, "Jhon"));
    students.add(new Student (19,"Navin"));
    students.add(new Student (23,"Raj"));
    students.add(new Student(18,"Ansh"));
    Collections.sort(students);
    for (Student s : students){
        System.out.println(s);
    }
}
    
}