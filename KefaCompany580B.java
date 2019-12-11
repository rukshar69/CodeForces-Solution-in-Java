/**
 * Created by Rukshar Alam on 10/22/2019.
 */

import java.util.*;

// User defined Pair class


// class to define user defined conparator

public class KefaCompany580B {

    static int upperBound(int[] array, int length, long value) {
        int low = 0;
        int high = length;
        while (low < high) {
            final int mid = (low + high) / 2;
            if (value >= array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    static class Pair {
        int x;
        int y;

        // Constructor
        public Pair(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }

    static class Compare {

        static  void compare(Pair arr[], int n)
        {
            // Comparator to sort the pair according to second element
            Arrays.sort(arr, new Comparator<Pair>() {
                @Override public int compare(Pair p1, Pair p2)
                {
                    return p1.x - p2.x;
                }
            });


        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // length of array
        int n = sc.nextInt(); int d = sc.nextInt();

        // Array of Pair
        Pair arr[] = new Pair[n];
        for(int i =0;i<n;i++){
            int m = sc.nextInt(); int f = sc.nextInt();
            arr[i] = new Pair(m,f);
        }


        Compare obj = new Compare();

        obj.compare(arr, n);

        /*
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();*/

        long friendCumulativeSum[] = new long[n+1];
        friendCumulativeSum[1] = arr[0].y;
        for (int i = 2; i <= n; i++) {
            friendCumulativeSum[i] = friendCumulativeSum[i-1]+arr[i-1].y;
        }

        int money[]=new int[n];
        for (int i = 0; i < n; i++) {
            money[i] = arr[i].x;
        }

        long m = 0;
        for(int i =0;i<n;i++){
            long f = (long)money[i]+ (long)d-1;
            int j = upperBound(money,n,f);

            while (j>=1){
                if(money[j-1]>f)j--;
                else break;
            }

            m = Math.max(m, (friendCumulativeSum[j]-friendCumulativeSum[i]));

        }

        System.out.println(m);

    }
}
