import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = input.nextInt();
        int[] list = new int[n];
        int e = 0;
        for (int i = 0 ; i < list.length; i++){
            e++;
            System.out.print(e + ". Number: " );
            int number = input.nextInt();
            list[i] = number;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
