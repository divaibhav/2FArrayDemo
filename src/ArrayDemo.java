import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        //create an array of size 5
        //type[] nameOfArray = new type[int size];
        int[] arr = new int[10];
        String[] srr = new String[5];
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(srr));
        //display(arr);
        //random generated array
        Random random = new Random();
        int upperLimit = 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        /*System.out.print("indexs:\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i);
            if(i != arr.length - 1){
                System.out.print(",");
            }
        }
        //to change line
        System.out.println();
        System.out.print("values:\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
*/
        System.out.println(Arrays.toString(arr));
        //printing odd elements
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();
        //print all the even elements at odd index
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 != 0){
                if(arr[i] % 2 == 0){
                    System.out.print(arr[i] + ",");
                }
            }
        }
    }
    public static void display(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
