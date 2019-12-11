/**
 * Created by Rukshar Alam on 11/22/2019.
 */
import java.util.Scanner;
public class BookReading_1213C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();

        for(int q =0;q<query;q++){
            long n = sc.nextLong(); long m = sc.nextLong();
            n /= m;
            long digits[] = new long[10];

            for(int i =0;i<10;i++){
                digits[i] = ((i+1)*m)%10;
            }
            long sum =0;

            for(int i=0;i<n%10;i++){
             sum+=digits[i];
            }

            long tempSum =0;
            for(int i =0;i<10;i++){
                tempSum+=digits[i];
            }

            sum+= (tempSum*(n/10));

            System.out.println(sum);
        }



    }
}
