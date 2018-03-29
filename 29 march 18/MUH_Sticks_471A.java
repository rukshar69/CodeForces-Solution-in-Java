import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/23/2018.
 */
public class MUH_Sticks_471A {
    public static void printArray(int[] a,int n){
        for(int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();

        int n  =6;

        ArrayList<Integer> a  = new ArrayList<Integer>();

        for(int i =0;i<n;i++){
            a.add(sc.nextInt()) ;

        }

        Collections.sort(a);
        int leg_len = a.get(3);
        int leg_cnt = 0;
        for(int i = 0;i<n;i++){
            if(a.get(i) == leg_len){
                leg_cnt++;
            }
        }

        if(leg_cnt<4){
            System.out.println("Alien");
        }
        else{
            for(int i = 0;i<n && a.size()>2;i++){
                if(a.get(i) == leg_len){
                    a.remove(i);
                    i--;
                }
            }

            if(a.get(0) == a.get(1)){
                System.out.println("Elephant");
            }
            else System.out.println("Bear");
        }






    }
}
