import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/2/2018.
 */
public class Worms_474B_v2 {

    static int binarySearch(int low ,int high, int q, int s[]){
        int index;
        if(low>high)index = 0;
        else {
            int mid = (low+high)/2;
            if(q==s[mid])index = mid+1;
            else{
                if(q<s[0]) return 1;
                if(q>s[mid] && q<s[mid+1])index = mid+2;
                else if(q<s[mid])index = binarySearch(low,mid-1,q,s);
                else index= binarySearch(mid+1,high,q,s);
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int s[]=new int[n];
        int sum = 0;
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
            s[i] = sum;
        }

        int m = sc.nextInt();


        for(int i = 0;i<m;i++){
            int q = sc.nextInt();

            int index = binarySearch(0,n,q,s);
            System.out.println(index);
        }
    }
}
