import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/3/2018.
 */
public class IlyaAndQueries_313B_v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        //sc.nextLine();
        int m = sc.nextInt();

        //System.out.println(s+" "+m);

        int n  = s.length();

        int sum[]=new int[n];

        sum[1] = 0;
        for(int i =1;i<n;i++){

            if(s.charAt(i)==s.charAt(i-1)){
                sum[i+1] = sum[i] + 1;
            }
            else
            {
                sum[i+1]= sum[i];
            }
        }

        for(int i = 0;i<m;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = sum[r] - sum[l];
            System.out.println(ans);
        }
    }


}
