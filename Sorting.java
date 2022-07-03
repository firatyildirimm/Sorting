import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int[] array = new int[size];

        for(int i=0;i< array.length;i++){
            System.out.println("Enter the " + (i+1) + ". element of array...");
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
