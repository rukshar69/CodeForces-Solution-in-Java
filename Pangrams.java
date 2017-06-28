import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Rukshar Alam on 6/28/2017.
 */
public class Pangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        input = input.toLowerCase();
        int frequency[]=new int[26];
        for(int i = 0;i<s1;i++)
        {
            frequency[input.charAt(i)-'a']++;
        }

        int count = 0;

        for(int i = 0;i<26;i++)
        {
            if(frequency[i]!=0)
            {
                count++;
            }
        }
        if(count==26)
        {
            System.out.println("YES");
        }
        else
            System.out.println("NO");

    }
}
