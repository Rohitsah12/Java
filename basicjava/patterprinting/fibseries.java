import java.util.Scanner;

public class fibseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int p=0;
        int q=1;
        int r=0;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
                r=p+q;
                p=q;
                q=r;
            }
            System.out.println();
        }
    }
}
