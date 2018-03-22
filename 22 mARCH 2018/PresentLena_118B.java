import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/21/2018.
 */
public class PresentLena_118B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int r = -n ;r<= n;++r){
            int temp =Math.abs(r);
            int top = n-temp;
            for(int i = 0;i<temp;++i){
                System.out.print(" ");
            }
            for(int i = 0;i<top ;++i){
                System.out.print(i+" ");
            }
            for(int i = top;i>0;--i){
                System.out.print(i+" ");
            }
            System.out.println("0");
        }
    }
}
