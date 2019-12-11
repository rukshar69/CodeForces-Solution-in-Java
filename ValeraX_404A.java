import java.util.Scanner;

/**
 * Created by Rukshar Alam on 12/11/2019.
 */
public class ValeraX_404A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] map = new char[n][n];
        sc.nextLine();

        for(int i =0;i<n;i++){
            String s = sc.nextLine();
            char[] tmp = s.toCharArray();
            map[i] = tmp;
        }


        if(n%2==0) System.out.println("NO");
        else{
            boolean flag = true;

            //all diagonal same letter check
            char diagonalLetter = map[0][0];
            for(int k =1;k<n;k++){
                if(map[k][k]!=diagonalLetter){
                    flag = false; break;
                }
            }

            int f=0, s=n-1;
            for(int k =0;flag && k<n;k++){
                if(map[f][s]!=diagonalLetter){
                    flag = false; break;
                }
                f++;s--;
            }

            if(flag==false) System.out.println("NO");
            else{


                for(int k =0;k<n;k++){
                    map[k][k] = '1';
                }

                f=0; s=n-1;
                for(int k =0; k<n;k++){
                    map[f][s] = '1';
                    f++;s--;
                }

                char nonDiagonalLetter = map[0][1];
                for(int i =0;flag && i<n;i++){
                    for(int j =0;j<n;j++){
                        if(map[i][j]!='1' && (map[i][j]==diagonalLetter || map[i][j] != nonDiagonalLetter)){
                            flag = false; break;
                        }
                    }
                }

                if(flag) System.out.println("YES"); else System.out.println("NO");
            }
        }




    }
}
