/**
 * Created by Rukshar Alam on 10/19/2019.
 */

import java.util.*;
public class ArrayStabilization1095B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = input.nextInt();
        }

        Arrays.sort(a);

        int instability = Math.min(a[n-1]-a[1],a[n-2]-a[0]);
        System.out.println(instability);
    }
}
