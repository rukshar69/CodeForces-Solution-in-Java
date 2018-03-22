import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/21/2018.
 */
public class Number_of_ways_466C {

    static void printArray(int[] a, int n){
        for(int i =0;i<n;i++){
            System.out.print(a[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];


        long s = 0;
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            s += a[i];
        }
        //System.out.println("sum "+s);

        if(s%3 != 0){
            System.out.println("0");
        }
        else{
            s /= 3;
            long ss = 0;
            int cnt[] =new int[n];
            Arrays.fill(cnt, 0);
            for(int i = n-1;i>=0;--i){
                ss += a[i];
                if(ss == s){
                    cnt[i] = 1;
                }
            }
            //System.out.println(ss);

            printArray(cnt, n);

            for(int i = n-2;i>=0;--i){
                cnt[i] += cnt[i+1];
            }
            printArray(cnt, n);

            long ans = 0;
            ss = 0;
            for(int i = 0;i+2<n;++i){
                ss += a[i];
                if(ss == s){
                    ans += cnt[i+2];
                }

            }
            printArray(cnt,n);
            System.out.println(ans);
        }


    }
}
