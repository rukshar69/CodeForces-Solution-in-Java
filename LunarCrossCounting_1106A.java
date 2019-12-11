/**
 * Created by Rukshar Alam on 11/21/2019.
 */
import java.util.*;
public class LunarCrossCounting_1106A {
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

        if(n>=3){

            int crosses = 0;
            for(int i=2;i<=n-1;i++){
                for(int j =2;j<=n-1;j++){

                    if(matrix[i][j] =='X'){
                        char x = matrix[i][j];
                        if(matrix[i+1][j+1]==x && matrix[i-1][j-1]==x && matrix[i-1][j+1]==x && matrix[i+1][j-1]==x)
                            crosses++;
                    }
                }

            }
            System.out.println(crosses);
        }
        else{
            System.out.println("0");
        }



    }
}
