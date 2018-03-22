import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/18/2018.
 */
public class Tower_37A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int map[] = new int[1001];

        for(int i = 0;i<=1000;i++){
            map[i] = 0;
        }

        for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
                map[a[i]]++;
            }

        int total_towers = 0;


        for(int i = 1;i<=1000;i++){
            if(map[i]>0)total_towers++;
        }

        Arrays.sort(map);
        int max = map[1000];

        System.out.println(max+" "+total_towers);

    }
}
