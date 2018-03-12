import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/5/2018.
 */
public class GrassHopperString_733A {
    static boolean isVowel(char c ){
        return (c == 'A'|| c == 'E'||c == 'I'||c == 'O'||c == 'U');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();

        int first = -1; int last = -1;
        for(int i = 0;i<n;i++){

            if(isVowel(s.charAt(i))){
                first = i; break;
            }
        }

        for(int i = n-1;i>=0;i--){

            if(isVowel(s.charAt(i))){
                last = i; break;
            }
        }

        int max = ((first+1)>(n-last))?first+1 : n-last;

        int cur = 0;

        for(int i = first;i<=last;i++){
            if(isVowel(s.charAt(i))){
                cur++;
                max = (max<cur)?cur:max;
                cur = 0;
            }
            else cur++;
        }

        System.out.println(max);
    }
}
