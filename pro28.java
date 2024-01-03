import java.util.Scanner;
public class pro28 {
    public static void main(String[] args) {
        System.out.println("Welcome to multiplication table");
        System.out.println(" enter the digit that,s table you want to be printed : ");
        Scanner Sc = new Scanner(System.in);
        int m = Sc.nextInt();
        printtable(m);


        }
        public static void printtable(int n) {


            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));

            }
        }
}
