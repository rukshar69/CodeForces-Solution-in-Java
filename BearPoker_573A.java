/**
 * Created by Rukshar Alam on 11/22/2019.
 */
import java.util.Scanner;
public class BearPoker_573A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            int tmp = sc.nextInt();
            while (tmp%2==0) tmp/=2;
            while (tmp%3==0) tmp/=3;
            a[i] =tmp;
        }

        boolean flag = true;
        for(int i = 1;i<n;i++){
            if(a[i] != a[0]){
                flag = false;break;
            }
        }

        if(flag) System.out.println("Yes"); else System.out.println("No");

    }
}
