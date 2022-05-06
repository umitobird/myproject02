package Test.score;

import Test.GraduateStudent;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        Student May = new Student("May",70,80);
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jack"));
        students.add(new Student("Hank", 60, 50));
        students.add(new GraduateStudent("Jane", 65,82,79));
        students.add(May);
        for (int i=0; i<students.size(); i++) {
            Student stu = students.get(i);
            stu.print();
//        for (Student s : students){
//            s.print();
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
