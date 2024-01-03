import java.util.Scanner;
 class add_two_number {
    public static void main(String[] args) {
        System.out.println("Welcome in program of adding two number taking input by user");
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int m= Sc.nextInt();
        int n= Sc.nextInt();
        int sum=n+m;
        System.out.println("The sum is "+sum);
    }
}
