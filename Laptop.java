import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/3/2018.
 */
public class Laptop{
    static class Pair implements Comparable<Pair>{
        int a;
        int b;

        public int compareTo(Pair A) {

            int compareQuantity = ((Pair) A).a;

            //ascending order
            return this.a - compareQuantity;

            //descending order
            //return compareQuantity - this.quantity;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair pair[]=new Pair[n];

        for(int i = 0;i<n;i++){
            pair[i] = new Pair();
            pair[i].a = sc.nextInt();
            pair[i].b = sc.nextInt();
        }

        Arrays.sort(pair);

        /*for(int i = 0;i<n;i++){
            System.out.println(pair[i].a+" "+pair[i].b);
        }*/

        boolean flag = false;
        for(int i = 0;i<n-1;i++){
            int b1 = pair[i].b;
            int b2 = pair[i+1].b;
            if(b1>b2){
                flag = true; break;
            }
        }

        if(flag){
            System.out.println("Happy Alex");
        }
        else
            System.out.println("Poor Alex");

    }
}
