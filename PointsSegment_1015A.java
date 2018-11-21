import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/21/2018.
 */
public class PointsSegment_1015A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m= scan.nextInt();
        boolean points[] = new boolean[m+1];
        //System.out.println(points[0]);
        for(int i =0;i<n;i++){
            int a,b;
            a = scan.nextInt();
            b= scan.nextInt();
            for(int j = a;j<=b;j++){
                points[j]= true;
            }
        }
        boolean ifAllTrue = false;
        int trueCount = 0;
        for(int i =1;i<=m;i++){
            if(points[i] == true){
                trueCount++;
            }
        }
        //System.out.println(trueCount);

        if(trueCount ==m){
            System.out.println("0");
        }else{
            System.out.println(m - trueCount);
            for(int i =1;i<=m;i++){
                if(points[i] == false){
                    System.out.print(i+" ");
                }
            }
        }



    }
}
