/**
 * Created by Rukshar Alam on 10/1/2019.
 */
import java.util.Scanner;
public class DiceRolling1093A {
    public static void main(String[] args) {
        int t,n;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        for(int t_ = 0;t_<t;t_++){
            int x = input.nextInt();
            int answer = Math.floorDiv(x,2);
            System.out.println(answer);
        }

    }
}
