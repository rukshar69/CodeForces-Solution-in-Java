import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/18/2018.
 */
public class Corman_bestFriend_732B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int total_add = 0;

        for(int i = 1;i<n;i++){
            int b = a[i-1]; int c = a[i];

            int add = Math.max(0, k-b-c);
            a[i] += add;
            total_add += add;

        }
        System.out.println(total_add);
        for(int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }
}
