import java.util.Scanner;
public class pro30 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("welcome in factorial");
        System.out.println("enter your number");

        int n= Sc.nextInt();
        long fact=factorial(n);
        System.out.println("Factorial is"+ fact);
    }
    public static long factorial( int n){
        if (n<2){
            return 1;
        }
        long fact=1;
        for (int i=1;i<=n;i++){
            fact= fact*i;

        }
        return fact;
    }
}
