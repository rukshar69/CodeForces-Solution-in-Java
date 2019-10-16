/**
 * Created by Rukshar Alam on 10/16/2019.
 */

import java.util.*;
public class BearFindingCriminal680B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); int a = input.nextInt();
        int criminalPresence[] = new  int[n+1];
        for(int i =1;i<=n;i++){
            criminalPresence[i] = input.nextInt();
        }

        int answer = 0;
        for(int i = 1; i <= n; ++i) if(criminalPresence[i]==1) {
            // can we catch criminal in city i?
            int distance = i - a; // distance from a
            int j = a - distance; // the other city at the same distance
            if(j < 1 || j > n || criminalPresence[i] == criminalPresence[j])
                ++answer;
        }
        System.out.println(answer);

    }
}
