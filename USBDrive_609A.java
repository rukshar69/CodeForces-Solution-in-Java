/**
 * Created by Rukshar Alam on 11/22/2019.
 */

import java.util.*;
public class USBDrive_609A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();

        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        int count = 0,i=n-1;
        while (m>0){
            m-=a[i];
            i--;
            count++;
        }
        System.out.println(count);


    }
}
