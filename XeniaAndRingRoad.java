import java.util.Scanner;

/**
 * Created by Rukshar Alam on 9/2/2017.
 */
public class XeniaAndRingRoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[]=new int[m];
        for(int i =0;i<m;i++)
        {
            a[i] = sc.nextInt();
        }

        long result = a[0]-1;
        for(int i =1;i<m;i++)
        {
            if(a[i]>=a[i-1])
                result += (a[i]-a[i-1]);
            else
                result += (n-(a[i-1]-a[i]));
        }

        System.out.println(result);
    }
}
