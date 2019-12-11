import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/21/2019.
 */
public class VitalyNight_595A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int m = sc.nextInt();
        int[][] f = new int[n][2*m];

        for(int i =0;i<n;i++){
            for(int j =0;j<2*m;j++){
                f[i][j] = sc.nextInt();
            }
        }

        int notSleeping=0;

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                int light1 = f[i][j*2];
                int light2 = f[i][j*2+1];

                if(light1==1||light2==1){
                    notSleeping++;
                }
            }
        }

        System.out.println(notSleeping);
    }
}
