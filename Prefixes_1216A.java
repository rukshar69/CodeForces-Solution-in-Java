/**
 * Created by Rukshar Alam on 11/21/2019.
 */

import java.util.*;
public class Prefixes_1216A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String input = sc.nextLine();
        char[] cStr = new char[n];

        int i =2;int changes = 0;
        while (i<=n){
            if(input.charAt(i-1)==input.charAt(i-2)){
                    cStr[i-1]='a';cStr[i-2]='b'; changes++;

            }
            else{
                cStr[i-1]=input.charAt(i-1);cStr[i-2]=input.charAt(i-2);

            }

            i+=2;
        }

        if(n%2==1){
            cStr[n-1]=input.charAt(n-1);
        }

        System.out.println(changes);
        System.out.println(cStr);
    }
}
