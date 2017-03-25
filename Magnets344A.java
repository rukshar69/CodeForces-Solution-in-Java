import java.util.Scanner;

/**
 * Created by rukshar on 3/25/17.
 */
public class Magnets344A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        int i = 1, group = 0;
        String  newMagnet, prev = sc.nextLine() ;

        while (i<=n) {
            newMagnet = sc.nextLine();
            if (newMagnet.equals(prev) ) {
                //do nothing

            } else
            {
                group++;

            }

            i++;
            prev = newMagnet;

        }
        System.out.println(group);

    }
}
