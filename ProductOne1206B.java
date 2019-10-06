/**
 * Created by Rukshar Alam on 10/1/2019.
 */
import java.util.Scanner;
public class ProductOne1206B {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] a = new int[n];
        int numberOfZero = 0; int neg = 0;
        for(int i =0;i<n;i++){
            a[i] = input.nextInt();
            if(a[i]==0)numberOfZero++;
            if(a[i]<0) neg++;
        }
        long cost = 0;

        for(int i=0;i<n;i++){
            if(a[i]>0){
                cost += (a[i]-1);
                a[i] = 1;
            }
            else if(a[i]<0){
                cost += (-1-a[i]);
                a[i] = -1;
            }
        }

        if(numberOfZero>0) cost += numberOfZero;
        else if(numberOfZero==0){
            if(neg%2==1) cost+=2;
        }

        System.out.println(cost);

    }
}
