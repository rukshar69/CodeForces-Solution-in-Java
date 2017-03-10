import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Rukshar Alam on 2/28/2017.
 */
public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        int arr[] = new int[n+1];
        for(int i = 0;i<=n;i++)
        {
            arr[i] = 0;
        }

        for(int i = 0;i<p;i++)
        {
            int a = sc.nextInt();
            arr[a] = 1;
        }

        int q = sc.nextInt();

        for(int i = 0;i<q;i++)
        {
            int  b = sc.nextInt();
            arr[b] = 1;
        }

        int flag = 1;

        for(int i = 1;i<=n;i++)
        {
            if(arr[i] == 0)
            {
                flag = 0; break;
            }
            else
            {}
        }

        /*for(int i = 1;i<=n;i++)
        {
            System.out.println(arr[i]);
        }*/

        // System.out.println(flag);

        if(flag == 1)
        {
            System.out.println("I become the guy.");

        }
        else
            System.out.println("Oh, my keyboard!");

    }
}
