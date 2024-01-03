import java.util.Arrays;
import java.util.Scanner;

public class pro42 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("welcome in finding min and max in a array");
   int[] array=arrayutility.inputarray();

        System.out.println("Array =  "+ Arrays.toString(array));
        int min= min(array);
        int max= max(array);
        System.out.println("The min is :"+min);
        System.out.println("The max is :"+max);


            }
            public static int min(int[] array){
        int min= Integer.MAX_VALUE;
                for (int i = 0; i <array.length ; i++) {
                    if (min>array[i]){
                        min=array[i];
                    }
                }
                return min;

            }
            public static int max(int[] array){
        if (array.length==0){
            return Integer.MIN_VALUE;
        }
        int max= array[0];
                for (int i = 1; i <array.length ; i++) {
                    if (max < array[i]){
                        max=array[i];
                    }

                }
                return max;

            }
        }




