import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/7/2017.
 */
public class CutRibbon_189A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int cuts[] = new int[3];
        cuts[0] = a; cuts[1] = b ; cuts[2]=c;

        Arrays.sort(cuts);

        int maximum_cuts_n[] = new int[4010];

        for(int i = 0;i<=n;i++){
            maximum_cuts_n[i] = Integer.MIN_VALUE;
        }


        maximum_cuts_n[0] =0;
        maximum_cuts_n[cuts[0]]  = 1;
        maximum_cuts_n[cuts[1]]  = 1;
        maximum_cuts_n[cuts[2]]  = 1;



        for(int i = 1;i<= n;i++){
            for(int j =0;j<3;j++){
                if(cuts[j]>i) break;
                else
                {
                    maximum_cuts_n[i] = Math.max(maximum_cuts_n[i - cuts[j]]+1,maximum_cuts_n[i]);
                }
            }
        }

        System.out.println(maximum_cuts_n[n]);

    }
}
