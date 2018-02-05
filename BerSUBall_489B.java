import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/1/2018.
 */
public class BerSUBall_489B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int m = sc.nextInt();

        int b[] = new int[m];

        for(int i = 0;i<m;i++){
            b[i]=sc.nextInt();
        }

        Arrays.sort(a);Arrays.sort(b);

        int pairs = 0;

        for(int i = 0;i<n;i++){

            for(int j = 0;j<m;j++){

                if(a[i]==b[j] || Math.abs(a[i]-b[j])==1){
                    pairs++;
                    b[j]=1111;
                    break;
                }

            }
        }

        System.out.println(pairs);



    }
}
