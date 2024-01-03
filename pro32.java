import java.util.Scanner;
public class pro32 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome to Favicon Series");
        System.out.println("Enter the number up to you want  to printed faviccni series ");
        int n= Sc.nextInt();
        System.out.println("the series is");
        printfavic(n);
    }
    public static void printfavic(int n){
        if (n<0) return;
        if (n==0)return;

        System.out.print("0 ");
        System.out.print("1 ");
        int first =0,second=1;
        while (first+second<=n){
            int third = first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }


    }
}
