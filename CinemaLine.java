import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/10/2018.
 */
public class CinemaLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        int a[] = new int[n];
        int change = 0;
        int ruble25 =0;
        int ruble50 = 0;
        int ruble100 = 0;
        boolean able = true;

        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();

        }

        for(int i =0;i<n;i++){

            if(a[i] == 25){
                ruble25++;

            }
            else if(a[i ] == 50) {
                if(ruble25==0){
                    able = false;
                    break;
                }
                else {
                    ruble25--;
                    ruble50++;
                }
            }
        }

        if(able){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
