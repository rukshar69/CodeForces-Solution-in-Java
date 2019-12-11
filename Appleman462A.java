import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/21/2019.
 */
public class Appleman462A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[][] matrix = new char[n+1][n+1];

        for(int i=1;i<=n;i++){

            String  temp =sc.nextLine();
            char[] t = temp.toCharArray();
            for(int j =1;j<=n;j++){
                matrix[i][j] = t[j-1];
            }

        }

        boolean flag=true;
        for(int i=1;i<=n && flag;i++){

            for(int j =1;j<=n;j++){
                char c1,c2,c3,c4;
                int count0=0;
                if(i-1>0)count0 = matrix[i-1][j]=='o'?count0+1:count0 ;
                if(i+1<n+1)count0 = matrix[i+1][j]=='o'?count0+1:count0 ;
                if(j-1>0)count0 = matrix[i][j-1]=='o'?count0+1:count0 ;
                if(j+1<n+1)count0 = matrix[i][j+1]=='o'?count0+1:count0 ;

                if(count0%2==1){
                    flag= false;
                    break;
                }

            }

        }
        if(flag) System.out.println("YES");else System.out.println("NO");
    }
}
