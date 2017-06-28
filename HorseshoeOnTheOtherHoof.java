import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Rukshar Alam on 6/28/2017.
 */
public class HorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();

        //System.out.println(s1+" "+s2+" "+s3+" "+s4);
        Set<Integer>set = new HashSet<>();
        set.add(s1);set.add(s2);set.add(s3);set.add(s4);
        System.out.println(4-set.size());
    }
}
