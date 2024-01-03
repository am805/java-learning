import java.util.Arrays;
import java.util.Scanner;

public class pro41 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Welcome to array  serarching");
        System.out.print("enter the size of array:" );
    int n=Sc.nextInt();
    int[] array=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("enter the element "+i+": ");

             array [i] =Sc.nextInt();
        }
        System.out.println("Array =  "+ Arrays.toString(array));
        System.out.println("Enter the number that you want to search");
        int target=Sc.nextInt();
        int num=0;

        for (int i = 0; i <array.length; i++) {

            if (array[i]==target){
                num++;
            }

        }
        System.out.println("the num is :"+num);

    }
}
