/**
 * Created by Rukshar Alam on 10/1/2019.
 */
import java.util.Scanner;
import java.util.*;
public class Enhancement1191A {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        HashMap<Integer,Character>map=new HashMap<Integer,Character>();
        map.put(0,'D');
        map.put(1,'A');
        map.put(2,'C');
        map.put(3,'B');

        int t= n%4;
        char category = map.get(t);
        int add = 0;

        n++;
        //add++;
        t = n%4;
        char temp = map.get(t);
        if(temp<category) {
            category = temp; add = 1;
        }

        n++;
        //add++;
        t = n%4;
        temp = map.get(t);
        if(temp<category){
            category = temp; add =2;
        }

        System.out.println(add+" "+category);


    }
}
