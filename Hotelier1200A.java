/**
 * Created by Rukshar Alam on 10/3/2019.
 */
import java.util.*;
public class Hotelier1200A {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        input.nextLine();
        String str = input.nextLine();
        char[] chars = str.toCharArray();
        int[] occupancy = new int[10];

        for(int i =0;i<10;i++){
            occupancy[i] = 0;

        }

        for(int i =0;i<n;i++){
            char ch = chars[i];
            if(ch =='L'){
                for(int j =0;j<10;j++){
                    if(occupancy[j]==0){
                        occupancy[j] = 1;
                        break;
                    }

                }
            }
            else if(ch =='R'){
                for(int j =9;j>=0;j--){
                    if(occupancy[j]==0){
                        occupancy[j] = 1;
                        break;
                    }

                }
            }
            else{
                int a=Character.getNumericValue(ch);
                occupancy[a] = 0;
            }
        }
        for(int j =0;j<10;j++){
            System.out.print(occupancy[j]);

        }
    }
}
