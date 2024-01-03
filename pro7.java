import java.util.Scanner;

class Swap_two_number {
     public static void main(String[] args) {
         Scanner Sc=new Scanner(System.in);
         System.out.println("Welcome in swaping of two number");
         System.out.println("Enter the number");
         int n= Sc.nextInt();
         int m= Sc.nextInt();
         int temp;
         temp=n;
         n=m;
         m=temp;
         System.out.println("After swaping the number" +n +m);
     }
}
