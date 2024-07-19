import java.util.Scanner;

public class blooddonation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int weight=sc.nextInt();
        if(age>=18){
            if(weight>=45){
                System.out.println("You are eligible");
            }
            else{
                System.out.println("Minimum weight should be 45. you are underweight");
            }
        }
        else{
            System.out.println("Minimum age should be 18. you are under age");
        }
    }    
}
