/**
 * Created by Rukshar Alam on 10/20/2019.
 */

import java.util.*;
public class KuriyamaStone433B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n= input.nextInt();

        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = input.nextInt();
        }

        int M= input.nextInt();

        for(int m = 0;m<M;m++){
            int type= input.nextInt();int l= input.nextInt();int r= input.nextInt();

            if(type == 1){
                long sum = 0;
                for(int i =l-1;i<=r-1;i++){
                    sum += a[i];
                }
                System.out.println(sum);
            }
            else{
                int[] b = Arrays.copyOf(a,a.length);
                Arrays.sort(b);
                long sum = 0;
                for(int i =l-1;i<=r-1;i++){
                    sum += b[i];
                }
                System.out.println(sum);
                //System.out.println(a[0]);
            }
        }

    }
}
