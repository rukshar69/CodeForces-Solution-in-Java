/**
 * Created by Rukshar Alam on 11/21/2019.
 */
import java.util.*;
public class LittleElephant_258A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int n = input.length();

        char[] cStr = input.toCharArray();
        int firstZero = -1;
        for(int i =0;i<n;i++){
            if(cStr[i]=='0'){
                firstZero = i; break;
            }
        }
        if(firstZero==-1){
            for(int i =0;i<n-1;i++){
                System.out.print("1");
            }
        }
        else{
            for(int i =0;i<n;i++){
                if(i!=firstZero)
                System.out.print(cStr[i]);
            }
        }
    }
}
