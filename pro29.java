import java.util.Scanner;
public class pro29 {
    public static void main(String[] args) {
        System.out.println("Calculate the sum of odd number from 1 to given number by user");
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = Sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum = sum + i;

        }
            System.out.println("The sum is " + sum);

    }
}


