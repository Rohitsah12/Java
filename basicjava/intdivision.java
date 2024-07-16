import java.util.Scanner;
class QuotientRemainder{
    void operation(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        int numerator=sc.nextInt();
        System.out.println("Enter the denominator: ");
        int denominator=sc.nextInt();
        int quotient=numerator/denominator;
        int remainder=numerator%denominator;
        System.out.println("The quotient is: "+quotient);
        System.out.println("The remainder is: "+remainder);
    }
}
public class IntDivision {
    public static void main(String[] args) {
        QuotientRemainder a=new QuotientRemainder();
        a.operation();
    }
}
