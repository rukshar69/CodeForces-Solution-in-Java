import java.util.*;

/**
 * Created by Rukshar Alam on 10/22/2019.
 */
public class UniformString1092A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int n = sc.nextInt(); int k = sc.nextInt();
            char[] c = new char[n]; int tempIndex=-1;

            int j =1,i;
            for( i =0;i<n-(n%k);i++)
            {

                    char ch = (char)('a'+(j-1));
                    c[i] = ch;
                    j++;
                    if(j>k)j=1;



            }

            tempIndex = i;

             j = 1;

            for( i =tempIndex;i<n;i++)
            {

                char ch = (char)('a'+(j-1));
                c[i] = ch;
                j++;


            }
            String s = new String(c);
            System.out.println(s);


        }
    }
}
