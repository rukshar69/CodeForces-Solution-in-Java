import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 4/14/2018.
 */
public class ValeraAntique_441A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int k = sc.nextInt();

        int count = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int outbid = 0;
            int j = sc.nextInt();
            for(int t = 0;t<j;t++){
                int temp = sc.nextInt();

                if(temp<k){
                    outbid++;

                }
            }

            if(outbid>0){
                count++;
                a.add(i+1);
            }
        }

        System.out.println(count);
        for(int i =0;i<count;i++){
            System.out.print(a.get(i)+" ");
        }
    }
}
