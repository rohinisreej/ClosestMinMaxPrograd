import java.util.Scanner;
public class Main {
    public static int smallestSubarraySize(int[] A) {
        int minIndex = 0;
        int maxIndex = 0;


        for (int i = 0; i < A.length; i++) {
            if (A[i] < A[minIndex]) {
                minIndex = i;
            }
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
        }


        int minSubarraySize = Math.abs(maxIndex - minIndex) + 1;

        return minSubarraySize;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=scanner.nextInt();
        System.out.println("Enter the array values: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }

        int smallestSize = smallestSubarraySize(arr);
        System.out.println(smallestSize);
    }
}