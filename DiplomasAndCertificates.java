import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/29/2017.
 */
public class DiplomasAndCertificates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); long k = sc.nextLong();

        long half = n/2;

        long winners =half;

        while (winners>=0) {

            double x = (double) winners / (double) (k + 1); //x + kx = half
            //x = half/(k+1)
            //x is diplomas, k*x certificates
            if ((long) x == x) {
                System.out.println((long) x + " " + ((long) x) * k + " " + (n - ((long) x + ((long) x) * k)));
                break;
            } else
                winners--;

        }
    }
}
