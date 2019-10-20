/**
 * Created by Rukshar Alam on 10/17/2019.
 */

import java.util.*;
public class Flowers474D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long t = input.nextLong(); long k = input.nextLong(); long mod =1000000007L;

        int N =100005;

        long dp[]=new long[N];

        for(long i =1;i<k;i++){
            dp[(int)i] = 1;
        }

        dp[(int)k] = 2;

        for(long i =k+1;i<N;i++){
            int index1 = (int)(i-k);
            int index2 =(int)(i-1);
            dp[(int)i] = (dp[index1] % mod + dp[index2] % mod) % mod;

        }

        //cumulative sum

        //cumulative sum
        for (long i = 1; i < N; i++)
        {
            dp[(int)i] = (dp[(int)i] % mod + dp[(int)i - 1] % mod)%mod;
        }

        for (int i = 0; i < t; i++)
        {
            int a = input.nextInt(); int b = input.nextInt();

            k = (dp[b] - dp[a - 1]) % mod;
            if (k < 0)
                k += mod;
            System.out.println(k);
        }

    }
}
