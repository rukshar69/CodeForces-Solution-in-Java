/**
 * Created by Rukshar Alam on 10/16/2019.
 */
import java.util.*;
public class Chessboard445A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); int m = input.nextInt(); input.nextLine();

        char chessBoard[][]=new char[n][m];

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){

                if(i%2==0){//even rows
                    if(j%2 ==0)chessBoard[i][j] = 'B';
                    else chessBoard[i][j] = 'W';
                }
                else{
                    if(j%2 ==0)chessBoard[i][j] = 'W';
                    else chessBoard[i][j] = 'B';
                }
            }
        }

        String givenBoard[]= new String[n];
        for(int i =0;i<n;i++){
            givenBoard[i] = input.nextLine();
        }

        for(int i =0;i<n;i++){
            String row = givenBoard[i];
            char[] r =row.toCharArray();
            for(int j =0;j<m;j++){

                if(r[j] =='-')
                    chessBoard[i][j] = '-';
            }
        }

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(chessBoard[i][j]);

            }

            System.out.println();
        }

    }
}
