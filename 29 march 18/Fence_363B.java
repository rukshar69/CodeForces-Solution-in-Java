import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/28/2018.
 */
public class Fence_363B {
    public static void printArray(int[] a,int n){
        for(int i =1;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();
        int[] h= new int[n+1];
        for(int i =1;i<=n;i++){
            h[i] = sc.nextInt();
        }

        int[] sum = new int[n-k+2];

        int t = 0;
        for(int i =1;i<=k;i++ ){
            t+= h[i];
        }
        sum[1] = t;

        int j = 1;
        for(int i =2;i<=n-k+1;i++){
            t = sum[i-1]-h[j]+h[i+k-1];
            j++;
            sum[i] = t;
        }

        //printArray(sum,n-k+1);
        int min_sum = Integer.MAX_VALUE;


        for(int i =1;i<=n-k+1;i++){
            if(sum[i]<min_sum){
                min_sum = sum[i];
                j = i;
            }
        }

        System.out.println(j);

    }
}
