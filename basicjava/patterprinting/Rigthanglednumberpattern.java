import java.util.Scanner;

public class Rigthanglednumberpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=(((i-1)*i)/2)+1;j<=(i*(i+1))/2;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
