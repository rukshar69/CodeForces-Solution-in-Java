import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 5/26/2018.
 */
public class Mahmoud_triangle_766B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        boolean flag  = false;
        int x,y,z;
        for(int i =1;i<n-1;i++){
            x = a[i-1];
            y = a[i];
            z = a[i+1];


            if(x+y>z){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
