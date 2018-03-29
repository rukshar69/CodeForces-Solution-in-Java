import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/28/2018.
 */
public class SashaSticks_832A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long k = sc.nextLong();


        long t = n/k;
        if(t%2 == 1){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
