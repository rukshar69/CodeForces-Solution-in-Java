/**
 * Created by Rukshar Alam on 10/3/2019.
 */
import java.util.*;
public class Nastya1136A {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        for(int i =0;i<n;i++){
            l[i] = input.nextInt();
            r[i] = input.nextInt();

        }
        int pg = input.nextInt();

        int completedChapters =0;
        //find the chapter shes currently in
        for(int i =0;i<n;i++){
            if(pg>r[i])completedChapters++;
            else if(pg>=l[i] && pg<=r[i]) break;

        }
        System.out.println(n-completedChapters);
    }
}
