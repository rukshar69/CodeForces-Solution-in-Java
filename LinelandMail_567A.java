import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/3/2018.
 */
public class LinelandMail_567A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x[]=new int[n];

        for(int i = 0;i<n;i++){
            x[i] = sc.nextInt();


        }

        for(int i = 0;i<n;i++){

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j = 0;j<n;j++){
                if(i == j)continue;
                int diff = Math.abs(x[i]-x[j]);
                if(diff<min)min=diff;
                if(diff>max) max = diff;
            }
            System.out.println(min+" "+max);
        }
    }
}
