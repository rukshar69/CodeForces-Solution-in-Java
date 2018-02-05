import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/4/2018.
 */
public class ChewbaccaAndNumber_514A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* char c = '4';

        int a = c - 48;
        System.out.println(a);*/

       String s = sc.nextLine();

       int n = s.length();

       for(int i = 0;i<n;i++){

           char c = s.charAt(i);
           int digit = c- 48;
           int alterDig = 9-digit;
           int min = (alterDig<digit)?alterDig:digit;
           if(i==0){
               if(alterDig ==0){
                   System.out.print(digit);
               }
               else System.out.print(min);
           }
           else System.out.print(min);
       }
    }
}
