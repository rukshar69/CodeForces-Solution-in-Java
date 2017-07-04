import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 7/4/2017.
 */
public class GravityFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);
        /*java.util.Arrays uses quicksort (actually dual pivot
         quicksort in the most recent version) for primitive types such as int and mergesort for objects that implement Comparable or use a Comparator.
          */

        //http://cafe.elharo.com/programming/java-programming/why-java-util-arrays-uses-two-sorting-algorithms/

        for(int i = 0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
