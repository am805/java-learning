import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome to prime number checking");
        System.out.println("Enter the number :");
        int n = Sc.nextInt();
        int l=pri(n);
        System.out.println(l);
    }
    public static int pri(int num1) {
        Scanner Sc = new Scanner(System.in);

        int n = Sc.nextInt();


        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("it is not a  prime number");
                break;
            } else {
                System.out.println("it is a prime number");
                break;
            }
        }
        return 0;
    }



    }

