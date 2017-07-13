package chapter22;

import java.util.*;

/**
 * Created by dingjiacheng on 2017/7/12.
 */
public class homework22_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        while(input.hasNextInt()){
            int tmp = input.nextInt();
            if (tmp==0) break;
            if(!map.containsKey(tmp)){
                map.put(tmp,1);
            }else{
                int value = map.get(tmp);
                System.out.print(value);
                value++;
                map.put(tmp,value);
            }
        }
        SortedMap<Integer,Integer> sort = new TreeMap<Integer,Integer>(map);

        Set<Map.Entry<Integer, Integer>> entry1=sort.entrySet();
        Iterator<Map.Entry<Integer, Integer>> it=entry1.iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer, Integer> entry=it.next();
            System.out.println("排序之后:"+entry.getKey()+" 值"+entry.getValue());
        }
    }
}
