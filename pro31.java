import java.util.Scanner;
public class pro31 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();//123
        int sum =0;
        int t =0;
        for (int i = n; i >0; i--) {
            t = n % 10;
            sum = sum + t;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
