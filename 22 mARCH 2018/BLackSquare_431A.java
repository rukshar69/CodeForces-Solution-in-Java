import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/21/2018.
 */
public class BLackSquare_431A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        int[] a = {a1,a2,a3,a4};

        sc.nextLine();
        String input = sc.nextLine();

        long sum = 0;
        int n = input.length();
        for(int i =0;i<n;i++){
            char c = input.charAt(i);

            int index = c - '0';
            sum += a[index-1];
        }
        System.out.println(sum);
    }
}
