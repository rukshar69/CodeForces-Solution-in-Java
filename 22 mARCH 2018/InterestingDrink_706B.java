import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/16/2018.
 */
public class InterestingDrink_706B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x[] = new int[n];

        for(int i = 0;i<n;i++){
            x[i] = sc.nextInt();


        }
        Arrays.sort(x);
        int q = sc.nextInt();

        int[ ] m = new int[q];
        for(int i = 0;i<q;i++){
            m[i] = sc.nextInt();


        }

        for(int i = 0;i<q;i++){
            int temp = m[i] ;
            int ans = -1;
            for(int j = n-1;j>=0;j--){
                if(x[j]<= temp){
                    ans = j;
                    break;

                }
            }

            System.out.println((ans+1));


        }








    }
}
