/**
 * Created by Rukshar Alam on 10/19/2019.
 */
import java.util.*;
public class SocialNetwork1234B1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = input.nextInt();
        }

        Queue<Integer> q = new LinkedList<>();
        Set<Integer> hash_Set = new HashSet<Integer>();

        int elementsInQ = 0;
        for(int i = 0;i<n;i++){

            if(hash_Set.contains(a[i])==false){

                if(elementsInQ<k){
                    elementsInQ++;
                    q.add(a[i]);
                    hash_Set.add(a[i]);
                }
                else{

                    int t = q.remove();
                    hash_Set.remove(t);
                    q.add(a[i]);
                    hash_Set.add(a[i]);
                }
            }
        }

        ArrayList list = new ArrayList(q);
        int sz = list.size();
        System.out.println(sz);
        for(int i =sz-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }

    }
}
