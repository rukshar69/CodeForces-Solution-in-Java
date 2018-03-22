import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/17/2018.
 */
public class WetShark_621A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
        int odd_n=0, even_n=0;
        long total_sum = 0;
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            total_sum += (long)a[i];
            if(a[i]%2 == 1) odd_n++;
            else even_n++;
        }

        int[] odd = new int[odd_n]; int odd_i=0;
        int[] even = new int[even_n];int even_i=0;

        long even_sum = 0;
        long odd_sum = 0;
        for(int i = 0;i<n;i++){
            if(a[i]%2 == 1){
                odd[odd_i] = a[i];
                odd_i++;

                odd_sum+= (long)a[i];
            }
            else {
                even[even_i] = a[i];
                even_i++;
                even_sum+= (long)a[i];
            }
        }

        Arrays.sort(odd);
        long ans = 0;
        if(total_sum%2 ==0){
            System.out.println(total_sum);
        }
        else if(even_n == n || even_n == n-1){
            System.out.println(even_sum);
        }
        else{
            ans += even_sum;
            if(odd_n%2 ==0 ){
                ans += odd_sum;
            }
            else{
                odd_sum -= (long)odd[0];
                ans += odd_sum;
            }
            System.out.println(ans);
        }


    }
}
