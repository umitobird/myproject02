package Test.score;

//修飾字(子) Modifier  public/default(package)/private/protected(子)
public class Student implements Printable {
    public String name ;
    protected int english;
    protected int math;
    public Student(String name){
        this.name = name;
    }
    public Student(String name, int english, int math){
        this(name);//this.name = name;
        this.english = english;
        this.math = math;
    }
    public Student(){
        this("John Doe",-1,-1);
    }
//    public void print(){
//        int average = (english+math)/2 ;
//        System.out.print(name + "\t" + english + "\t"
//                + math + "\t" + getAverage()) ;
//        if (getAverage() < 60){
//            System.out.print("*");
//        }
//        System.out.println();
//    }
    public int getAverage(){
        return (english+math)/2;
    }
    @Override
    public void print(){
        System.out.print(name + "\t" + english + "\t" + math + "\t" + getAverage()) ;
        if (getAverage() < 60){
            System.out.print("*");
        }
        System.out.println();
    }
}
