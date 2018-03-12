import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/10/2018.
 */
public class Cards_701A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        int a[] = new int[n];
        int sum = 0;
        int players = n/2;
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int eachPlayer = sum/players;
        for(int i =0;i<n-1;i++){
            if(a[i]!= 0) {
                System.out.print((i+1)+" ");
                for (int j = i + 1; j < n; j++) {
                    if(a[i]+a[j] == eachPlayer){
                        System.out.println((j+1));
                        a[i] = 0; a[j] = 0;
                        break;
                    }
                }
            }
        }
    }
}
