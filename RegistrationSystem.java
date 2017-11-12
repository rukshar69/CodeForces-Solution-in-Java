import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Rukshar Alam on 11/11/2017.
 */
public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String ,Integer> map=new HashMap<String ,Integer>();

        int n = sc.nextInt();
        sc.nextLine();

        for(int i  = 1;i<= n;i++){
            String  s = sc.nextLine();
            //System.out.println(s);
            if(map.containsKey(s) == false){
                System.out.println("OK");
                map.put(s,0);
            }
            else
            {
                int serial = map.get(s);
                serial++;
                System.out.println(s+serial);
                map.put(s, serial);
            }
        }
    }
}
