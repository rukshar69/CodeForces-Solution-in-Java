import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/3/2018.
 */
public class IlyaAndQueries_313B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        //sc.nextLine();
        int m = sc.nextInt();

        //System.out.println(s+" "+m);

        int n  = s.length();

        for(int i = 0;i<m;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();

            int pair = 0;
            for(int j =l-1;j<r-1;j++){
                if(s.charAt(j)==s.charAt(j+1))pair++;
            }

            System.out.println(pair);
        }
    }
}
