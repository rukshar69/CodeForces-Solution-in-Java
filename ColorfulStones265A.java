/**
 * Created by Rukshar Alam on 10/18/2019.
 */

import java.util.*;
public class ColorfulStones265A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s =input.nextLine();
        String t = input.nextLine();

        char[] sCh = s.toCharArray();
        char[] tCh = t.toCharArray();
        int szt = tCh.length;

        int currentPosition = 1;

        for(int i =0;i<szt;i++){
            //System.out.print(t.charAt(i));
            if(tCh[i] == sCh[currentPosition-1])currentPosition++;
        }
        System.out.println(currentPosition);


    }
}
