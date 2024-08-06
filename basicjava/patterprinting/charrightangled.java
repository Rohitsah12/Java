import java.util.Scanner;

public class charrightangled {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char temp='A';
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
            }
            System.out.println();
            temp++;
        }
    }
}
