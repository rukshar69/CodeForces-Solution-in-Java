/**
 * Created by Rukshar Alam on 10/19/2019.
 */

import java.util.*;
public class Ehab1088A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x= input.nextInt();

        int a=0,b=0;
        boolean flag = false;
        for(int i =1;i<=x && flag==false;i++){
            a= i;
            for(int j = 1;j<=x && flag==false;j++){
                b= j;
                if(a%b==0 && a*b >x && (a/b)<x){
                    flag = true;
                }
            }
        }

        if(flag == true)
        System.out.println(a+" "+b);
        else System.out.println("-1");
    }
}
