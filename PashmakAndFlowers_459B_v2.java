import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/2/2018.
 */
public class PashmakAndFlowers_459B_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];


        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for(int i = 0;i<n;i++){
            a[i] = sc.nextLong();

            if(a[i]>max)max = a[i];
            if(a[i]<min)min = a[i];
        }

        int c1 = 0; int c2 = 0;

        for(int i=0;i<n;i++){
            if(a[i]==max) c1++;
            if(a[i]==min) c2++;
        }

        if(max == min){
            long ans = (n*(n-1))/2;
            System.out.println("0 "+ans);
        }
        else
        {
            System.out.println((max - min)+" "+c1*c2);
        }


    }
}
