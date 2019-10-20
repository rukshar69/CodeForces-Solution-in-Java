/**
 * Created by Rukshar Alam on 10/17/2019.
 */

import java.util.*;
public class NightWatch768A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = input.nextInt();
        }

        Arrays.sort(a);
        int mx = a[n-1], mn = a[0];

        int supported = 0;

        for(int i =1;i<n-1;i++){

            int current = a[i];
            if(current>mn && current<mx)supported++;
        }

        System.out.println(supported);
    }
}
