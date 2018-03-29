import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/27/2018.
 */
public class SystemEquation_214A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int m = sc.nextInt();

        int answer = 0;

        for(int b = 0;b*b<=m && b<=n;b++){
            int a = m - b*b;
            if(a*a + b == n){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
