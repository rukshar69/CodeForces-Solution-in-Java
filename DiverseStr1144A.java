/**
 * Created by Rukshar Alam on 10/1/2019.
 */
import java.util.Scanner;
import java.util.Arrays;
public class DiverseStr1144A {
    public static void main(String[] args) {
        int t,n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.nextLine();
        for(int z = 0;z<n;z++){
            String str  = input.nextLine();
            //System.out.println(str);
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            int sz = chars.length;
            boolean flag = true;
            for(int i = 0;i<sz-1;i++){
                if(chars[i]+1!=chars[i+1])
                {
                    flag=false;
                    break;
                }
            }
            if (flag) System.out.println("YES");
            else System.out.println("NO");


        }
    }
}
