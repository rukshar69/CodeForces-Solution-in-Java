import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/17/2018.
 */
public class Japanese_Crossword_721A {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        //System.out.println(n+" "+s);
        //int i = 0;
        ArrayList<Integer>len = new ArrayList<Integer>();
        int count = 0;
        int group_count = 0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == 'B'){
                count++;
            }
            else{
                if(count>0){
                    len.add(count);
                    group_count++;
                }
                count=0;
            }
        }
        if(count>0){
            group_count++;
            len.add(count);

        }
        System.out.println(group_count);
        int m = len.size();
        if(m>=0){
            for(int i = 0;i<m;i++){
                System.out.print(len.get(i)+" ");
            }
            System.out.println();
        }

    }
}
