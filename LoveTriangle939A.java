/**
 * Created by Rukshar Alam on 11/21/2019.
 */
import java.util.*;
public class LoveTriangle939A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[n+1];
        for(int i =1;i<=n;i++){
            f[i] = sc.nextInt();
        }

        boolean flag = false;

        for(int i =1;i<=n;i++){
            if(f[f[f[i]]]==i){
                flag = true; break;
            }
        }
        if(flag) System.out.println("YES");else System.out.println("NO");


    }
}
