import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/16/2018.
 */
public class InterestingDrink_706B_optimized {

    public static int binarySearch(int[] x, int n,int temp){

        int first = 1; int last = n; int mid;
        int pos = -1;
        while (first<= last){
            mid = (first+last)/2;

            if(x[mid]==temp){
                pos = mid;
                first = mid+1;
            }
            else if(x[mid]>temp){
                last = mid - 1;
            }
            else
                first = mid + 1;
        }
        if(pos != -1){
            return pos;
        }
        else return first - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x[] = new int[n+1];

        for(int i = 1;i<=n;i++){
            x[i] = sc.nextInt();


        }
        Arrays.sort(x);
        int q = sc.nextInt();

        int[ ] m = new int[q];
        for(int i = 0;i<q;i++){
            m[i] = sc.nextInt();

            int ans = binarySearch(x,n,m[i]);
            if(ans != - 1)
                System.out.println((ans-1+1));
            else
                System.out.println("0");

        }


    }
}
