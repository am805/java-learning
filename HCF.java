import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("welocme to HCF");
        System.out.println("Enter the first number");
        int n= Sc.nextInt();
        System.out.println("Enter the Second number");
        int m= Sc.nextInt();
        int hcf=hcf(n,m);
        System.out.println("The HCF is :"+hcf);
    }
    public static int hcf(int n,int m){
        for (int i = n; i >=1 ; i--) {
            for (int j = m; j >=1 ; j--) {
                if (m % i == 0 && n%i==0){
                    return i;
                }
            }


        }

        return 0;
    }
}
