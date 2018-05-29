import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/29/2018.
 */
public class Queue_545D {

    public static int not_disappointed(int[] a,int n){
        Arrays.sort(a);
        long sum = 0;
        int Not_disappointed = 0;
        for(int i = 0;i<n;i++){
            //System.out.println(sum);
            if(a[i]>=sum){
                Not_disappointed++;
                sum += a[i];
            }
        }
        return  Not_disappointed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long sum = a[0];
        int Not_disappointed = 1;
        for(int i = 1;i<n;i++){
            //System.out.println(sum);
            if(a[i]>=sum){
                Not_disappointed++;
                sum += a[i];
            }
        }

        System.out.println(not_disappointed(a,n));
    }
}
