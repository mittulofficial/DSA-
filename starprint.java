import java.util.Scanner;

public class starprint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        starprint(arr, n);
    }

    public static void starprint(int[] h, int n) 
    {
        int max = h[0];
        for (int i = 0; i < n; i++)
            if (h[i] > max) max = h[i];
        for (int floor = max; floor > 0; floor --) 
         {
            for (int j = 0; j < h.length; j++) 
            {
                int bh = h[j];
                if (bh >= floor)
                    System.out.print("* ");
                else
                    System.out.print("  ");
         }
            System.out.println();
        }
    }
}
