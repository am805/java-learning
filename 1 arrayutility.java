import java.util.Scanner;
public class arrayutility {
    public static int[] inputarray(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int size=Sc.nextInt();
        int [] num= new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Please enter  element number"+i+" :");
            num[i]=Sc.nextInt();
        }
        return num;

    }

}
