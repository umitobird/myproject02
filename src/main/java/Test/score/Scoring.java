package Test.score;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack");
        jack.english = 70;
        jack.math = 88;
        Student Hank = new Student("Hank",60,50);
        Student s = new Student();
        GraduateStudent jane = new GraduateStudent("Jane",65,82,79);

        jane.print();
        jack.print();
        Hank.print();
    }
}
