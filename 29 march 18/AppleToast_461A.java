import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/29/2018.
 */
public class AppleToast_461A {

    public static void printArray(long[] a,int n){
        for(int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();


        int[] a= new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        long sum = 0;
        for(int i =0;i<n;i++){
            sum += a[i];
        }

        long cumulative_sum[] = new long[n];
        cumulative_sum[0] = sum;
        for(int i = 1;i<n;i++){
            cumulative_sum[i] = cumulative_sum[i-1]-(long) a[i-1];
        }

        //printArray(cumulative_sum,n);

        sum = 0;
        for(int i = 0;i<n;i++){
            sum += cumulative_sum[i];
        }

        sum += cumulative_sum[0];

        System.out.println(sum);

    }
}
