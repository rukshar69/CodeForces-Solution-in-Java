/**
 * Created by Rukshar Alam on 10/13/2019.
 */
import java.util.*;
public class RoomsStaircases1244B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        for(int t=0;t<T;t++){
            int n = input.nextInt();
            input.nextLine();
            String  stairs = input.nextLine();
            char a[] = stairs.toCharArray();
            int sz = a.length;

            boolean allZero = true;
            for(int i =0;i<sz;i++){
                if(a[i] == '1'){
                    allZero = false;
                    break;
                }
            }

            if(allZero) System.out.println(sz);
            else{
                if(a[0]=='1' || a[sz-1]=='1') System.out.println(sz*2); //traverse all rooms in 2 floors
                else {
                    int temp1 = sz+1;

                    int temp2 = -1;
                    for(int i =1;i<=n-2;i++){
                        if(a[i]=='1'){
                            int t1 =(i+1)*2; int t2 = (sz-i)*2;
                            t1 = Math.max(t1,t2);
                            temp2 =Math.max(t1,temp2);
                        }
                    }

                    temp1 = Math.max(temp1,temp2);

                    System.out.println(temp1);

                }
            }
        }

    }
}
