/**
 * Created by Rukshar Alam on 10/8/2019.
 */

import  java.util.*;
public class DistinctDigit1228A {
    static boolean allDigDifferent(int x){
        String xStr = Integer.toString(x);
        char[] ch=xStr.toCharArray();
        int[] freq = new int[26];
        int sz = ch.length;
        for(int i =0;i<sz;i++){
            freq[ch[i]-'0']++;
        }
        boolean flag = true;

        for(int i =0;i<26;i++){
            if(freq[i]>1)flag = false;
        }

        return  flag;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt(); int r = input.nextInt();

        for(int i =l;i<=r;i++){
            int x = i;

        }
    }
}
