/**
 * Created by Rukshar Alam on 10/16/2019.
 */
import java.util.*;
public class Lily1199B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double H = input.nextDouble(); double L = input.nextDouble();

        double Lsq = Math.pow(L,2); double Hsq = Math.pow(H,2);
        double answer = (Lsq-Hsq)/(2*H);
        System.out.println(answer);

    }
}
