import java.util.Scanner;

/**
 * Created by Rukshar Alam on 3/13/2018.
 */
public class CinemaLine_349A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0;i<n;i++){
            a[i]= sc.nextInt();
        }

        int count_25 = 0; int count_50 = 0;int count_100 = 0;
        boolean bool = true;
        for(int i = 0;i<n;i++){

            int temp = a[i];
            if(temp == 25){
                count_25++;
            }
            else if(temp == 50){
                count_50++;
                count_25--;
                if(count_25<0){
                    bool= false;
                    break;
                }
            }
            else if(temp == 100){
                count_100++;
                if(count_25-1>= 0 && count_50-1 >= 0){
                    count_25--;
                    count_50--;
                }else  if(count_25-3>=0){
                    count_25 -=3;
                }else {
                    bool = false;break;
                }
            }

        }

        if(bool){
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
}
