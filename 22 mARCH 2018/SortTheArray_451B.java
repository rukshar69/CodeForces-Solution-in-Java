import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/22/2018.
 */
public class SortTheArray_451B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a= new int[n];
        int [] b = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }

        Arrays.sort(b);
        HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
        for(int i = 0;i<n;i++){
            map.put(b[i],i);
        }

        for(int i =0;i<n;i++){
            a[i] = map.get(a[i]);
        }

        int l = -1;
        for(int i = 0;i<n;i++){
            if(a[i]!= i){
                l = i;
                break;
            }
        }

        int r = -1;

        for(int i = n-1;i>=0;i--){
            if(a[i]!= i){
                r = i;
                break;
            }
        }

        if(l == -1 || r == -1){
            System.out.println("yes");
            System.out.println("1 1");
        }
        else{
            int startIndex = l; int endIndex = r;
            int half = startIndex + ((endIndex + 1) - startIndex) / 2;
            int endCount = endIndex;
            for (int startCount = startIndex; startCount < half; startCount++) {
                int store = a[startCount];
                a[startCount] = a[endCount];
                a[endCount] = store;
                endCount--;
            }


            boolean ok = true;
            for(int i = 0;i<n;i++){
                if(a[i]!= i){
                    ok = false;
                }
            }

            if(ok){
                System.out.println("yes");
                System.out.println((l+1)+" "+(r+1));
            }
            else
                System.out.println("no");

        }
    }
}
