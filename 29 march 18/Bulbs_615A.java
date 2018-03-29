import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/29/2018.
 */
public class Bulbs_615A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        int[] a = new int[m+1];
        Arrays.fill(a,0);
        for(int i =0;i<n;i++){
            int t =sc.nextInt();
            for(int j =0;j<t;j++){
                int ind = sc.nextInt();
                a[ind] = 1;
            }
        }

        boolean all_lit = true;
        for(int j =1;j<=m;j++){
            if(a[j] ==0){
                all_lit = false;
            }
        }

        if(all_lit){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
