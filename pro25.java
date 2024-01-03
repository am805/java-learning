import java.util.Scanner;
class Swap_number_without_using_third_variable {
     public static void main(String[] args) {
         Scanner Sc = new Scanner(System.in);
         System.out.println("Welcome to swap without using third variable");
         System.out.println("enter the number ");
         int n=Sc.nextInt();
         int m=Sc.nextInt();
         System.out.print(n);
         System.out.print(m);
         System.out.println();
         n=n+m;
         m=n-m;
         n=n-m;
         System.out.print(n);
         System.out.print(m);
     }
}
