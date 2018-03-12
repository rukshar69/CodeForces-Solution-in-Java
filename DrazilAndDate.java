import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/8/2018.
 */
public class DrazilAndDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long s = sc.nextLong();

        a = Math.abs(a);b = Math.abs(b);
        long minPath = a+b;
        if(minPath>s){
            System.out.println("NO");
        }
        else if(minPath == s){
            System.out.println("YES");
        }else
        {
            long remain = s - minPath;
            if(remain%2 == 0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
