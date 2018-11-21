import java.util.Scanner;
import java.util.*;

/**
 * Created by Rukshar Alam on 11/12/2018.
 */
public class PolycarpPocket_1003A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[ ] = new int[n];

        for(int i =0;i<n;i++){
            a[i] = scan.nextInt();
        }

        int count[] = new int[101];
        for(int i =0;i<n;i++){
            count[a[i]]++;
        }

        int maximum  = count[0];
        int max_index = 0;
        for(int i =1;i<101;i++){
            if(count[i]>maximum){
                maximum = count[i];
                max_index = i;
            }
        }

        System.out.println(maximum);


    }
}
