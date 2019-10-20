/**
 * Created by Rukshar Alam on 10/18/2019.
 */

import java.util.*;
public class Game984A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = input.nextInt();
        }

        Arrays.sort(a);
        if(n%2 ==1){
            System.out.println(a[n/2]);
        }
        else{
            System.out.println(a[(n/2)-1]);
        }

    }
}
