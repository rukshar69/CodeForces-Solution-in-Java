import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Rukshar Alam on 6/23/2017.
 */
public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        Set<Character> set = new HashSet<Character>();

        for(int i = 0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c>='a' && c<='z')
            {
                set.add(c);
            }
        }
        System.out.println(set.size());
    }
}
