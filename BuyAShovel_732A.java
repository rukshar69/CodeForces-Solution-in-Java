import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/11/2017.
 */
public class BuyAShovel_732A {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int k = sc.nextInt(); int r = sc.nextInt();

        for(int x = 1;x<=10;x++){
            if((k*x)%10 == 0 || (k*x)%10 == r)
            {
                System.out.println(x);
                break;
            }
        }
    }
}
