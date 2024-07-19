import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark=nextInt();
        char grade;
        if(mark>=90){
            grade='A';
        }
        else if(mark>=80){
            grade='B';
        }
        else if(mark>=70){
            grade='C';
        }
        else if(mark>=60){
            grade='D';
        }
        else{
            grade='F';
        }
    }
}
