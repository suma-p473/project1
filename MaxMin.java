import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int largest = arr[0];
        int smallest = arr[0];

        
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

     
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
