import java.util.Scanner;

/**
 * Created by Rukshar Alam on 6/28/2017.
 */
public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  guest = sc.nextLine();
        String  host = sc.nextLine();
        String random = sc.nextLine();
        int f1[] = new int[26];
        int n = guest.length();
        int m =host.length();
        int p = random.length();

        for(int i = 0;i<n;i++)
        {
            f1[guest.charAt(i)-'A']++;
        }
        for(int i = 0;i<m;i++)
        {
            f1[host.charAt(i)-'A']++;
        }

        int f2[]= new int [26];
        for(int i = 0;i<p;i++)
        {
            f2[random.charAt(i)-'A']++;
        }

        boolean flag = true;
        for(int i = 0;i<26;i++)
        {
            if(f2[i]!= f1[i])
            {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
