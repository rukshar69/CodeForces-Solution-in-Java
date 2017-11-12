import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/12/2017.
 */
public class ChoosingTeams432A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt(); int k = sc.nextInt();

        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int teams = 0;
        int personInTeam = 0;
        int index = 0;

        while (index<n && 5 - a[index]>=k ){
            personInTeam++;
            index++;
            if(personInTeam==3){
                personInTeam=0;
                teams++;
            }
        }

        System.out.println(teams);
    }
}
