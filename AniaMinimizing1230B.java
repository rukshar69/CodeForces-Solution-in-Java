/**
 * Created by Rukshar Alam on 10/20/2019.
 */

import java.util.*;
public class AniaMinimizing1230B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n= input.nextInt();int k= input.nextInt(); input.nextLine();

        String s = input.nextLine();

        if(k==0) System.out.println(s);
        else{
            if(n==1) System.out.println("0");
            else{

                char c[] = s.toCharArray();
                int kCounter = 0;
                for(int i = 0;i<n;i++){
                   if(i==0 && c[i] != '1'){c[i]='1'; kCounter++;}
                   else if(i==0 && c[i] == '1'){//do nothing
                        }
                   else {
                       if(c[i]!='0'){
                           kCounter++; c[i] = '0';
                       }
                   }

                   if(kCounter==k)break;

                }

                s = new String(c);

                System.out.println(s);
            }
        }
    }
}
