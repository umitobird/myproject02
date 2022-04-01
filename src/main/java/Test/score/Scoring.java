package Test.score;

import Test.sales.Customer;
import Test.sales.GoldenCustomer;
import Test.sales.PlatiumCustomer;
import Test.sales.SilverCustomer;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jack"));
        students.add(new Student("Hank", 60, 50));
        students.add(new GraduateStudent("Jane", 65,82,79));
        for (Student s : students){
            s.print();
        }
//        Student jack = new Student("Jack");
//        jack.english = 70;
//        jack.math = 88;
//        Student Hank = new Student("Hank",60,50);
//        Student s = new Student();
//        GraduateStudent jane = new GraduateStudent("Jane",65,82,79);
//
//        jane.print();
//        jack.print();
//        Hank.print();
    }
}
