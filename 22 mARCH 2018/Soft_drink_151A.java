import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/18/2018.
 */
public class Soft_drink_151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l  = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int total_drink = k*l;
        int toast_drink = total_drink/nl;
        int total_slice = c*d;
        int salt_per_person = p/np;

        int toast = Math.min(toast_drink,Math.min(total_slice, salt_per_person));
        System.out.println(toast/n);
    }
}
