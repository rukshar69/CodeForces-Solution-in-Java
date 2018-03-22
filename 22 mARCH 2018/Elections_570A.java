import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/21/2018.
 */
public class Elections_570A {

    static void printArray(int[] a, int n){
        for(int i =0;i<n;i++){
            System.out.print(a[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = sc.nextInt();
        int [][] a = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }

        int winner[] = new int[m];

        for(int i = 0;i<m;i++){

            int maxi = Integer.MIN_VALUE;
            int win = -1;
            for(int j = 0;j<n;j++){
                if(a[i][j] > maxi){
                    maxi = a[i][j];
                    win = j;
                }
            }
            winner[i] = win;
        }

        //printArray(winner,m);

        int[] candidate_win = new int[n];
        Arrays.fill(candidate_win,0);



        for(int i = 0;i<m;i++){


            candidate_win[winner[i]]++;
        }

        //printArray(candidate_win,n);

        int maxi = Integer.MIN_VALUE;
        int president = -1;

        for(int i = 0;i<n;i++){

            if(candidate_win[i]>maxi){
                maxi = candidate_win[i];
                president = i+1;
            }
        }

        System.out.println(president);

    }
}
