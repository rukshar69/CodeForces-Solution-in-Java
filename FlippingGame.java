import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/20/2017.
 */
public class FlippingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num[] = new int[n];
        for(int i  = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }


        int maxCnt = 0;
        int t[] = new int[n];
        for(int k = 0; k < n; k++){
            t[k] = num[k];
        }
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){

                int tempCnt = 0;
                for(int k = i; k <= j; k++){
                    t[k] = 1-t[k];
                }
                for(int k = 0; k < n; k++){
                    if(t[k] == 1 ){
                        tempCnt++;
                    }
                }
                for(int k = 0; k < n; k++){
                    t[k] = num[k];
                }
                maxCnt = Math.max(maxCnt, tempCnt);
            }
        }
        System.out.println(maxCnt);
    }
}
