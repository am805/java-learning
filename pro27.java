import java.util.Scanner;
 class reverse_number {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome in reversing the number");
        System.out.println("enter the number");
        int n=Sc.nextInt();
        int k=0 ;

        while (n!=0){
            int r=n%10;
             k=k*10+r;
            n=n/10;

        }
        System.out.println(k);

    }
}
