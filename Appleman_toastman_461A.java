import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/3/2018.
 */
public class Appleman_toastman_461A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();


        int[] a= new int[n];
        //a[0] = 0;
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        long sum = 0;
        for(int i =0;i<n-1;i++){
            sum += a[i]*(i+2);
        }

        sum += n*a[n-1];

        System.out.println(sum);
    }
}
