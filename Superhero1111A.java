/**
 * Created by Rukshar Alam on 10/18/2019.
 */

import java.util.*;
public class Superhero1111A {

    static  boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s =input.nextLine();
        String t = input.nextLine();

        int n =s.length(); int m = t.length();

        if(n!=m){
            System.out.println("No");
        }
        else{
            boolean flag = true;

            for(int i=0;i<n;i++){
                if((isVowel(s.charAt(i)) && !isVowel(t.charAt(i))) || (!isVowel(s.charAt(i)) && isVowel(t.charAt(i))))
                {
                    flag=false;
                    break;
                }
            }

            if(flag) System.out.println("Yes"); else System.out.println("No");
        }


    }
}
