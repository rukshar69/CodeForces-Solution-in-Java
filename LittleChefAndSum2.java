import java.util.Scanner;

/**
 * Created by Rukshar Alam on 9/1/2017.
 */
public class LittleChefAndSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int t = 0;t<testCases;t++)
        {
            int n = sc.nextInt();
            int a[] = new int[n+1];
            for(int i = 1;i<=n;i++)
            {
                a[i] = sc.nextInt();
            }

            long minSum = 10000000001L;
            long incrementalSum[]=new long[n+1];


            incrementalSum[1] = a[1];
            incrementalSum[0] = 0L;

            for(int i = 2;i<=n;i++)
            {
                incrementalSum[i] = incrementalSum[i-1]+a[i];
            }

            int index= 1;
            for(int i = 1;i<=n;i++)
            {
                long prefixSum = incrementalSum[i];
                long suffixSUm = 0L;


                int numberOfElements_forSuffix_sum = n - i +1;
                int rest = n - numberOfElements_forSuffix_sum ;
                suffixSUm = incrementalSum[n] - incrementalSum[rest];

                long sum = prefixSum + suffixSUm;
                if(sum<minSum){minSum = sum; index = i;}
            }

            System.out.println(index);

        }
    }
}
