import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/2/2018.
 */
public class Devu_Churu_439A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int d = sc.nextInt();

        int sum = 0;
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }

        sum += (n-1)*10;

        if(sum<= d){
            int jokes = (n-1)*2;

            int remainingTime = d-sum;
            jokes += ((remainingTime)/5);
            System.out.println(jokes);
        }
        else
            System.out.println("-1");


    }
}
