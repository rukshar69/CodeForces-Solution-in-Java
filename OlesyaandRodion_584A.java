import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/11/2017.
 */
public class OlesyaandRodion_584A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int t = sc.nextInt();

        if(t == 10){
            if(n == 1) System.out.println("-1");
            else{
                for(int i = 1;i<=n-1;i++){
                    System.out.print("1");
                }
                System.out.println("0");
            }
        }
        else
        {
            for(int i = 1;i<=n;i++){
                System.out.print(t);
            }
            System.out.println();
        }
    }
}
