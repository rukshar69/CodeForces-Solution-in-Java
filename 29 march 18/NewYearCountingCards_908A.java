import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/27/2018.
 */
public class NewYearCountingCards_908A {

    static boolean isVowel(char c ){
        if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'i'){
            return true;
        }
        return false;
    }

    static boolean isOdd(char c ){
        if(c>='0' && c<= '9'){
            int a = c -48;
            if(a%2 != 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();

        int turn = 0;
        String vowel = "aeiou";
        String odd ="13579";

        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            int ind_vowel = vowel.indexOf(c);
            int ind_odd = odd.indexOf(c);
            if(ind_odd!= -1 || ind_vowel != -1){
                turn++;
            }
        }
        System.out.println(turn);
    }
}
