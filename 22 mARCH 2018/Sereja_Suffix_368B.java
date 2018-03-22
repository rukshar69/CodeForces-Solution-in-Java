import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/18/2018.
 */
public class Sereja_Suffix_368B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];


        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();

        }

        HashMap<Integer,Boolean>map = new HashMap<Integer,Boolean>();
        int[] distinct = new int[n];
        for(int i = n-1;i>= 0;i--){
            map.put(a[i],true);
            distinct[i] = map.size();
        }


        for(int i = 0;i<m;i++){
            int l = sc.nextInt();
            System.out.println(distinct[l-1]);
        }

    }
}
