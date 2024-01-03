import java.util.Arrays;
import java.util.Scanner;
public class pro40 {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=Sc.nextInt();
        int [] array=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("enter the element "+i+": ");
            array[i]= Sc.nextInt();
        }
        System.out.println("Array =  "+Arrays.toString(array));

        long sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+= array[i];
        }
        System.out.println("the sum is:"+sum);
float average=sum/ array.length;
        System.out.println("the average is :"+average);

    }
}