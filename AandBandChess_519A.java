import java.util.Scanner;

/**
 * Created by Rukshar Alam on 2/1/2018.
 */
public class AandBandChess_519A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s[]=new String[8];

        for(int i = 0;i<8;i++){
            s[i] = sc.nextLine();
        }

        /*for(int i = 0;i<8;i++){
            System.out.println(s[i]);
        }*/

        int Apoint = 0; int Bpoint = 0;

        for(int i = 0;i<8;i++){
            String  temp = s[i];

            for(int j = 0;j<8;j++){
                char c = temp.charAt(j);
                if(c == 'Q'){
                    Apoint += 9;
                }else if(c == 'R'){
                    Apoint += 5;
                }
                else if(c == 'B'){
                    Apoint += 3;

                }
                else if(c == 'N'){
                    Apoint += 3;

                }
                else if(c == 'P'){
                    Apoint += 1;

                }
                else if(c == 'K'){

                }
                else if(c == 'q'){
                    Bpoint += 9;

                }
                else if(c == 'r'){
                    Bpoint += 5;

                }
                else if(c == 'b'){
                    Bpoint += 3;

                }
                else if(c == 'n'){
                    Bpoint += 3;

                }
                else if(c == 'p'){
                    Bpoint += 1;

                }
                else if(c == 'k'){

                }
            }
        }

        if(Apoint>Bpoint){
            System.out.println("White");
        }
        else if(Bpoint>Apoint){
            System.out.println("Black");
        }
        else
            System.out.println("Draw");
    }
}
