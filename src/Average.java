/**
* Create an array to store the elements
* Input the elements of the array from the user
* Calculate the sum of elements
* Calculate the average by dividing the sum by the number of elements
* Output the average
*/
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / n;

        System.out.println(average);
        scanner.close();
    }
}
