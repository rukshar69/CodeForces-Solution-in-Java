import java.util.Scanner;

/**
 * Created by Rukshar Alam on 9/1/2017.
 */
public class LittleChefAndSums {
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

            int index= 1;

            for(int i = 1;i<=n;i++)
            {
                long prefixSum = 0L;
                long suffixSUm = 0L;

                for(int j = 1;j<=i;j++)
                {
                    prefixSum += a[j];

                }

                int numberOfElements_forSuffix_sum = n - i +1;
                int startIndex = n - numberOfElements_forSuffix_sum + 1;

                for(int j = startIndex;j<=n;j++)
                {
                    suffixSUm += a[j];

                }

                long sum = prefixSum + suffixSUm;
                if(sum<minSum){minSum = sum; index = i;}
            }

            System.out.println(index);

        }
    }
}
