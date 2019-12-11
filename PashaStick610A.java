/**
 * Created by Rukshar Alam on 11/22/2019.
 */
import java.util.*;
public class PashaStick610A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        if(n%2==1) System.out.println("0");
        else if(n%4==0) System.out.println((n/4)-1);
        else System.out.println(n/4);
    }
}
