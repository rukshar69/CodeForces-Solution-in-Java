import java.util.Scanner;

/**
 * Created by Rukshar Alam on 1/3/2018.
 */
public class DreamoonandStairs_476A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();

        int lowerB = (int)Math.ceil((double)n/2.0);

        int answer = (int)Math.ceil((double)lowerB/(double)m) * m;

        if(answer>n){
            System.out.println("-1");
        }
        else System.out.println(answer);
    }
}
