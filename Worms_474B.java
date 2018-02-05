import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/2/2018.
 */

public class Worms_474B {

    static class interval{
        int upper;
        int lower;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        int b[] = new int[m];
        for(int i = 0;i<m;i++){
            b[i] = sc.nextInt();
        }

        //for(int i = 0;i<m;i++){
            //System.out.println(b[i]);
        //}

        interval intervals[] = new interval[n];
        intervals[0] = new interval();
        intervals[0].lower = 1;
        intervals[0].upper = a[0];
        int prevUpper = a[0];
        for(int i = 1;i<n;i++){
            intervals[i] = new interval();
            intervals[i].lower = prevUpper+1;
            intervals[i].upper = prevUpper+a[i];

            prevUpper = intervals[i].upper;
            //System.out.println(intervals[i].lower+" "+
            //intervals[i].upper);
        }

        for(int i = 0;i<m;i++){
            //System.out.println(b[i]);
            int query = b[i];

            for(int j = 0;j<n;j++){
                if(query>= intervals[j].lower && query<=intervals[j].upper){
                    System.out.println(j+1);
                    break;
                }

            }
        }


    }
}
