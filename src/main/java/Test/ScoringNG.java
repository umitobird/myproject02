package Test;

public class ScoringNG {
    public static void main(String[] args) {
        String [] name = {"A","B","C"};
        int [] English = {10,20,30};
        for (int i = 0; i <3; i++) {
            if (i!=2){
                System.out.println(name[i]+"\t"+English[i]);
            }
        }
    }
}
