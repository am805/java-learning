import java.util.Arrays;
import java.util.Scanner;

public class arryinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n=sc.nextInt();
        int []arr=new int [n];
        System.out.println("Enter Array Element");
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Array =  "+Arrays.toString(arr));
    }
}
