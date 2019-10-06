/**
 * Created by Rukshar Alam on 10/1/2019.
 */
import java.util.Scanner;
public class badPrices1213BEfficient {
    public static void main(String[] args) {
        int t,n;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();

        for(int test = 0;test<t;test++){
            n = input.nextInt();
            int[] a = new int[n];
            for(int i =0;i<n;i++){
                a[i] = input.nextInt();
            }
            int badDays = 0;
            int tempArray[] = new int[n];
            tempArray[n-1] = a[n-1];
            for(int i =n-2;i>=0;i--){
                tempArray[i] = Math.min(a[i],tempArray[i+1]);
            }
            for(int i =0;i<n;i++){
                if(tempArray[i] != a[i])
                    badDays++;
            }
            System.out.println(badDays);

        }
    }
}
