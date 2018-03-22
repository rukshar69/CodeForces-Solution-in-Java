import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/13/2018.
 */
public class TwoSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        boolean f1 = false; boolean f2 = false;
        int inc = 1;
        int n = s.length();
        for(int i = 0;i<n-1; i+= inc){

            inc = 1;
            if(s.charAt(i)=='A' && s.charAt(i+1)=='B'){
                f1 = true;
                i += 2;
                inc = 1;
            }
            if(f1){
                if(s.charAt(i)=='B' && s.charAt(i+1)=='A'){
                    f2 = true;
                }
            }
        }
        if(f1== false || f2 == false){

            f1 = false; f2 = false;
            for(int i =0;i<n-1;i+=inc){
                inc = 1;
                if(s.charAt(i)=='B' && s.charAt(i+1)=='A'){
                    f2 = true;
                    i += 2;
                    inc = 1;
                }
                if(f1){
                    if(s.charAt(i)=='A' && s.charAt(i+1)=='B'){
                        f1 = true;
                    }
                }
            }
        }

        if (f1 && f2) {

            System.out.println("YES");
        }else System.out.println("NO");
    }
}
