/**
 * Created by Rukshar Alam on 10/18/2019.
 */

import java.util.*;
public class Juicer709A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();int b = input.nextInt();int d = input.nextInt();

        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = input.nextInt();
        }

        int trash = 0;
        int numberTimeEmptied = 0;
        for(int i =0;i<n;i++){
            if(a[i]<=b){
                trash += a[i];

                if(trash>d){
                    numberTimeEmptied++;
                    trash = 0;
                }

            }
        }

        if(trash>d)numberTimeEmptied++;

        System.out.println(numberTimeEmptied);
    }
}
