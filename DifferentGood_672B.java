/**
 * Created by Rukshar Alam on 11/21/2019.
 */
import java.util.*;
public class DifferentGood_672B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String input = sc.nextLine();
        if(n>26){
            System.out.println("-1");

        }
        else{
            int[] freq = new int[26];
            for(int i =0;i<n;i++){
                int index =input.charAt(i)-'a' ;
                freq[index]++;
            }
            int changes = 0;

            for(int i =0;i<26;i++){
                if(freq[i]>1)changes += (freq[i]-1);
            }

            System.out.println(changes);

        }
    }
}
