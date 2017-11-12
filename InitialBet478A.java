import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/12/2017.
 */
public class InitialBet478A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int sum = a+b+c+d+e;

        if(sum == 0 || sum%5 != 0) System.out.println("-1");
        else if(sum%5 ==0) System.out.println(sum/5);
    }
}
