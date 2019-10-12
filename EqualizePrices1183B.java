/**
 * Created by Rukshar Alam on 10/11/2019.
 */
import  java.util.*;
public class EqualizePrices1183B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Q = input.nextInt();

        for(int q = 0;q<Q;q++){
            int n = input.nextInt(); long k = input.nextLong();
            Integer a[] = new Integer[n];
            for(int i =0;i<n;i++){
                a[i] = input.nextInt();

            }

            // using Collections.min() to find minimum element
            // using only 1 line.
            int min = Collections.min(Arrays.asList(a));

            // using Collections.max() to find maximum element
            // using only 1 line.
            int max = Collections.max(Arrays.asList(a));

            if(min+k>=max-k)System.out.println(min+k);
            else
                System.out.println("-1");
        }
    }
}
