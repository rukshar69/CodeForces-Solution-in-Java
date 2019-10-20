/**
 * Created by Rukshar Alam on 10/19/2019.
 */

import java.util.*;
public class InfinityGauntlet987A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initializing a Dictionary
        Dictionary geek = new Hashtable();
        // put() method
        geek.put("purple", "Power");
        geek.put("green", "Time");
        geek.put("blue","Space");
        geek.put("orange","Soul");
        geek.put("red","Reality");
        geek.put("yellow","Mind");


        int n = input.nextInt(); input.nextLine();

        String [] a = new String [n];
        for(int i =0;i<n;i++){
            a[i] = input.nextLine();
        }
        System.out.println(6-n);

        for(int i =0;i<n;i++){
            geek.remove(a[i]);

        }

        // elements() method :
        for (Enumeration i = geek.elements(); i.hasMoreElements();)
        {
            System.out.println(i.nextElement());
        }

    }
}
