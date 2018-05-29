import java.util.Scanner;

/**
 * Created by Rukshar Alam on 5/10/2018.
 */
public class Books_279B {
    static int brute_force(int a[] ,int n,int t){
        int maxi = Integer.MIN_VALUE;

        for(int i =0;i<n;i++){
            int temp_t = t;
            int count = 0;
            int j  =i;
            while (temp_t>0 && j<n){
                temp_t -= a[j];
                if(temp_t>=0) {
                    j++;
                    count++;
                }
            }
            maxi = Math.max(maxi, count);
            //System.out.println(maxi);
        }
        //System.out.println(maxi);
        return maxi;
    }

    static  int dynamic(int a[] ,int n,int t){
        int maxi = Integer.MIN_VALUE;
        int maxCount = -1;

        int [][] dyn = new int[n][n];
        for(int i =0;i<n;i++){
            dyn[i][i] = a[i];
        }

        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                dyn[i][j] = dyn[i][j-1] + a[j];
            }
        }

        for(int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                if(dyn[i][j]<=t){
                    int count = j-i+1;
                    maxi =  Math.max(maxi, count);
                }
            }
        }



        return  maxi;

    }

    static  int sum_array(int a[] ,int n,int t){
        int maxi = Integer.MIN_VALUE;

        int sum[] = new int [n];

        sum[0] = a[0];
        for(int i =1;i<n;i++){
            sum[i] = sum[i-1]+a[i];
        }

        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int diff = sum[j] - sum[i];
                if(diff<=t){
                    int count = j-i+1;
                    maxi =  Math.max(maxi, count);
                }
            }
        }

        return  maxi;

    }

    static int correct_version(int a[] ,int n,int t){
        int maxi = Integer.MIN_VALUE;

        int j = 0;
        int time = 0;
        while (j<n && time+ a[j]<=t){
            time += a[j++];
        }

        maxi = j;
        for(int i = 0;i<n;i++){
            time -= a[i];
            while (j<n && time+ a[j]<=t){
                time += a[j++];
            }
            if(j -i-1 >maxi){
                maxi = j-i-1;
            }
        }

        return  maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int n = sc.nextInt();

        int t = sc.nextInt();

        int[] a= new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int maxi = correct_version(a,n,t);
        System.out.println(maxi);

    }
}
