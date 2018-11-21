/**
 * Created by Rukshar Alam on 11/12/2018.
 */




import java.util.*;

public class TwoGrams_977B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();
        //System.out.println(s);
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(int i =0;i<n-1;i++){
            String tempStr = s.substring(i,i+2);
            //System.out.println(tempStr);
            if(map.containsKey(tempStr)){
                int count = map.get(tempStr);
                //System.out.println(tempStr);
                count++;
                map.replace(tempStr,count);
            }else{
                map.put(tempStr,1);
            }

        }

        /*for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }*/

        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());
                break;// Print the key with max value
            }
        }

    }
}
