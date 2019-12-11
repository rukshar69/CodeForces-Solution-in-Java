import java.util.Scanner;

/**
 * Created by Rukshar Alam on 12/11/2019.
 */
public class Army_38A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int days[] = new int[n+1];
        for(int i =0;i<n-1;i++){
            days[i]=sc.nextInt();
        }

        int a = sc.nextInt(); int b= sc.nextInt();

        int total = 0;

        for(int i =a-1;i<b-1;i++){
            total+=days[i];
        }

        System.out.println(total);

    }
}
