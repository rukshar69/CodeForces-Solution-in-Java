/**
 * Created by Rukshar Alam on 10/1/2019.
 */
import java.util.Scanner;
public class BadPrices1213B {
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
            int baddays = 0;
            for(int i =0;i<n-1;i++){
                int temp = a[i];
                for(int j =i+1;j<n;j++){
                    int t2 = a[j];
                    if(temp>t2){
                        //System.out.print(temp+" ");
                        baddays++;
                        break;
                    }
                }
            }
            System.out.println(baddays);
        }
    }
}
