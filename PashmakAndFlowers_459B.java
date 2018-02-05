import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/2/2018.
 */
public class PashmakAndFlowers_459B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];


        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();

        }

        Arrays.sort(a);
        int maxDiff = a[n-1]-a[0];
        int pairs = 0;
        for(int i = 0;i<n-1;i++){

            for(int j = n-1;j>=i+1;j--){
                if(a[j]-a[i] == maxDiff){
                    pairs++;
                }
                else if(a[j]-a[i] < maxDiff){
                    break;
                }
            }
        }

        System.out.println(maxDiff+" "+pairs);
    }
}
