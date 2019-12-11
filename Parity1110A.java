/**
 * Created by Rukshar Alam on 11/22/2019.
 */

import java.util.*;
public class Parity1110A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long b = sc.nextLong();int k = sc.nextInt();
        long a[] = new long[k+1];

        for(int i =1;i<=k;i++){
            a[i] = sc.nextLong();
        }

        if(b%2==0) {
            if(a[k]%2==0) System.out.println("even"); else System.out.println("odd");
        }
        else{
            int oddCount = 0;
            for(int i =1;i<=k;i++){
                if(a[i]%2==1) oddCount++;
            }

            if(oddCount%2==0) System.out.println("even"); else
                System.out.println("odd");
        }

    }
}
