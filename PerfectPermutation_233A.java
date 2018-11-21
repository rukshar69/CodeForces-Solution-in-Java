import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/21/2018.
 */
public class PerfectPermutation_233A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n%2 ==1){
            System.out.println("-1");
        }
        else{
            for(int i = 1;i<=n;i++){
                if(i%2 ==1){
                    System.out.print((i+1)+" ");
                }
                else{
                    System.out.print((i-1)+" ");
                }
            }
        }
    }
}
