import java.util.Scanner;

/**
 * Created by Rukshar Alam on 12/11/2019.
 */
public class NaVotes_1173A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); int y = sc.nextInt();int z = sc.nextInt();
        int upvote = x; int downvote = y;

        if( z==0) {
            if(upvote==downvote)
            System.out.println("0");
            else{
                if(upvote>downvote) System.out.println("+");else System.out.println("-");
            }
        }
        else{
            //z is upvote
            char decision1 ='a';
            if(upvote+z>downvote)decision1='+';else if(upvote+z<downvote)decision1='-';else decision1='0';

            char decision2 = 'a';
            if(upvote<downvote+z)decision2='-'; else if(upvote>downvote+z)decision2='+';else decision2='0';

            if(decision1==decision2) System.out.println(decision1);
            else System.out.println("?");
        }
    }
}
