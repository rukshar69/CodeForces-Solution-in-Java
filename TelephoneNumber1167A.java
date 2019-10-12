/**
 * Created by Rukshar Alam on 10/11/2019.
 */
import  java.util.*;
public class TelephoneNumber1167A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int t =0;t<T;t++){

            int n = input.nextInt();
            input.nextLine();

            String str = input.nextLine();
            boolean flag = true;
            if(n<11){
                flag = false;
            }
            else if(n==11){
                if(str.charAt(0)!='8') flag =false;

            }
            else{
                int check = n-11 +1;
                boolean temp = false;
                for(int i =0;i<check;i++){
                    if(str.charAt(i)=='8'){
                        temp = true;
                        break;
                    }
                }
                if(temp==false) flag = false;
            }

            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
