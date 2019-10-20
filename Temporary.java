/**
 * Created by Rukshar Alam on 10/19/2019.
 */
import java.util.*;
public class Temporary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = input.nextInt();
        }

        int min = 1000000, max = -1,minIndex =-1, maxIndex=-1;
        for(int i =0;i<n;i++){

            if(a[i]<min){min = a[i]; minIndex = i;}
            if(a[i]>max){max = a[i]; maxIndex = i;}
        }

        a[minIndex] = a[maxIndex] = -1;
        int nextMin = 1000000, nextMax = -1;

        for(int i =0;i<n;i++){

            if(a[i]<nextMin && a[i]>0){nextMin = a[i]; }
            if(a[i]>nextMax && a[i]>0){nextMax = a[i]; }
        }


        int instability = Math.min(max-nextMin, nextMax-min );
        System.out.println(instability);

    }
}
