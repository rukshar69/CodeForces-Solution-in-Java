import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/17/2018.
 */
public class NumberofPosition_124A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int a = sc.nextInt(); int b = sc.nextInt();

        n -= a;
        int pos = 0;
        while (n!= 0)
        {
            int temp = n-1;
            if(temp<=b){
                pos++;
            }
            n--;
        }

        System.out.println(pos);
    }
}
