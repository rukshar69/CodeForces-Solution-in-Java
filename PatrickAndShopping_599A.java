import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 12/24/2017.
 */
public class PatrickAndShopping_599A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int d3 = scanner.nextInt();

        int case1 = d1+d2+d3;

        int case2 = 2*d1+2*d2;
        int case3 = 2*d2+2*d3;
        int case4 = 2*d1+2*d3;

        int a[] = {case1,case2,case3,case4};

        Arrays.sort(a);
        System.out.println(a[0]);




    }
}
