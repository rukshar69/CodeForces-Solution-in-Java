import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/9/2018.
 */
public class Lecture_499B {

    public static void printMap(HashMap mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            //it.remove(); // avoids a ConcurrentModificationException
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();
        sc.nextLine();

        HashMap<String ,String > map = new HashMap<String ,String >();
        for(int i = 0;i<m;i++){
            String temp = sc.nextLine();
            //System.out.println(temp);
            String a[] = temp.split(" ");
            map.put(a[0],a[1]);
        }

        //printMap(map);
        String input = sc.nextLine();
        String inp[] = input.split(" ");
        for (int i = 0;i<n;i++){
            String word = map.get(inp[i]);
            int a = inp[i].length();
            int b = word.length();
            if(b<a)
            System.out.print(word+ " ");
            else
                System.out.print(inp[i]+" ");
        }
        System.out.println();
    }
}
