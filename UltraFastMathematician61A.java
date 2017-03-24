import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/24/2017.
 */
public class UltraFastMathematician61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        //System.out.println(one+" "+two);
        int n = one.length();
        for(int i = 0;i<n;i++)
        {
            char a = one.charAt(i);
            char b = two.charAt(i);
            if((a=='0' && b=='0') ||(a=='1' && b=='1') )
            {
                System.out.print("0");
            }
            else
            {
                System.out.print("1");
            }
        }

    }
}
