import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome to LCM :");
        System.out.println("Enter the first number  :");
        int o = Sc.nextInt();
        System.out.println("Enter the second number  :");
        int n = Sc.nextInt();
        System.out.println("Enter the third number  :");

        int m = Sc.nextInt();
        int lcm = lcm(m, n, o);
        System.out.println("The lcm is :" + lcm);
    }


    public static int lcm(int m, int n, int o) {

        for (int i = 1; i < (n * m * o); i++) {
            if (i % m == 0 && i % n == 0 && i % o == 0) {
                return i;

            }
        }
        return 0;


    }
}
