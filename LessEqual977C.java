/**
 * Created by Rukshar Alam on 10/18/2019.
 */

import java.util.*;
public class LessEqual977C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();int k = input.nextInt();

        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = input.nextInt();
        }

        Arrays.sort(a);

        if(k==0 && a[0]>1)
            System.out.println("1");

        else if(k==0 && a[0]==1)
            System.out.println("-1");

        else if(k<=n-1){
            if(a[k-1]!=a[k])
                System.out.println(a[k-1]);
            else
                System.out.println("-1");
        }

        else if(k==n)
            System.out.println(a[k-1]);

    }
}
