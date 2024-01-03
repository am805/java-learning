import java.util.Scanner;
public class pro33 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n=Sc.nextInt();
        int m=Sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j+=1) {
                if (i==1 || j==1||i==n||j==n){
                    System.out.print(" * ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
