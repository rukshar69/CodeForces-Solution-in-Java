import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/18/2017.
 */
public class EvenOdds318AMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n%2 == 0) {
            if (k <= n / 2)
            {
                long m = n/2;
                long num = 1 + (k-1)*2;
                System.out.println(num);
            }
            else
            {
                long m = n/2;
                k -= (n/2);
                long num = 2 + (k-1)*2;
                System.out.println(num);

            }

        }
        else
        {
            if (k <= (n / 2) + 1)
            {
                long m = n/2;
                long num = 1 + (k-1)*2;
                System.out.println(num);
            }
            else
            {
                long m = n/2;
                k -= ((n/2) + 1);
                long num = 2 + (k-1)*2;
                System.out.println(num);

            }
        }
    }
}
