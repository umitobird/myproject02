package Test.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
//        try{
//            FileReader fileReader = new FileReader("scores.txt");//throws
//            int data = fileReader.read();
//            while(data != -1){//不等於空值
//                System.out.print((char)data);
//                data = fileReader.read();
//            }
        try {
            FileReader fileReader = new FileReader("scores.txt");//throws
            BufferedReader reader = new BufferedReader(fileReader);//讀整行
            //Jack,85,35
            String line = reader.readLine();
            while(line != null){
//                System.out.println(line);
                String[] token = line.split(",");//斷點
                String name = token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student student = new Student(name, english, math);
                student.print();
                line = reader.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("檔案讀取失敗");
        }catch (IOException e){
            System.out.println("資料讀取失敗");
        }
//        System.out.println("Testing");
    }
}
