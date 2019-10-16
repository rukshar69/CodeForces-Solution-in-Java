/**
 * Created by Rukshar Alam on 10/16/2019.
 */

import java.util.*;
public class Origami1080A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextLong(); long k = input.nextLong();

        long red = (n*2)%k==0? (n*2)/k:((n*2)/k)+1;
        long green = (n*5)%k==0? (n*5)/k:((n*5)/k)+1;
        long blue = (n*8)%k==0? (n*8)/k:((n*8)/k)+1;

        System.out.println(red+green+blue);
    }
}
