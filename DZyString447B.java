/**
 * Created by Rukshar Alam on 10/19/2019.
 */
import java.util.*;
public class DZyString447B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        int k = input.nextInt();

        int a[] = new int[26];

        int max = -1;
        for(int i = 0;i<26;i++){
            a[i] = input.nextInt();
            max = max<a[i]?a[i]:max;
        }

        int power = 0; int sz = s.length();

        for(int i =0;i<sz;i++){
            power += (i+1)*a[s.charAt(i)-'a'];
        }

        //System.out.println(power);
        for(int i =sz;i<sz+k;i++){
            power += (i+1)*max;
        }
        //power += max*k;
        System.out.println(power);


    }
}
