import java.util.Scanner;

public class hollowsquarediagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==1||j==1||i==a||j==a||i==j||j==a-i+1){
                    System.out.print("|");
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
