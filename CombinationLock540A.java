import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/11/2017.
 */
public class CombinationLock540A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String  a = sc.nextLine();
        String  b = sc.nextLine();

        int moves = 0;

        for(int i = 0;i<n;i++){
           char a1 = a.charAt(i);
           char b1 = b.charAt(i);
           moves += Math.min(10-Math.abs(a1-b1),Math.abs(a1-b1));


        }


        System.out.println(moves);
    }
}
