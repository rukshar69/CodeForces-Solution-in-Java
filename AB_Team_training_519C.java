import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/14/2018.
 */
public class AB_Team_training_519C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m= sc.nextInt();

        int ans = -1;
        for(int i = 0;i<=n;i++){
            int cur = i;
            int leftn = n-i;
            int leftm = m - 2*i;

            if(leftm>=0){
                cur+= Math.min(leftm,leftn/2);
                ans = Math.max(ans,cur);
            }
        }

        System.out.println(ans);
    }
}
