import java.util.Scanner;
public class pro26 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome in adding the digit of number");
        System.out.println("enter the number");
        int n=Sc.nextInt();
        int k=0 ;
while (n!=0){
    int r=n%10;
    k+=r;
    n=n/10;
}
        System.out.println("the sum is " +k);
    }

}
