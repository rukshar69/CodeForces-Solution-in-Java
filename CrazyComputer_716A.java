import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/1/2018.
 */
public class CrazyComputer_716A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int c = sc.nextInt();

        int a[]= new int[n];

        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int words = 1;
        for(int i = 1;i<n;i++){
            int diff  = a[i]-a[i-1];

            if(diff>c){
                words=1;
            }
            else words++;
        }

        System.out.println(words);
    }
}
