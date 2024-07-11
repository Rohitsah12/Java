public class incrementation {
    public static void main(String[] args){
        int a=5, b=3 , c=-1 , d=0 , e=-5;
        int res;
        res=(--c) - (a--) + (++e) + (--b) - (d--) + (++d) - (a++) + (++b) +(c++) - (b--) + (--a);
        System.out.println("The Value of a is: "+a);
        System.out.println("The Value of b is: "+b);
        System.out.println("The Value of c is: "+c);
        System.out.println("The Value of d is: "+d);
        System.out.println("The Value of e is: "+e);
        System.out.println("The final result is: "+res);


    }
}
