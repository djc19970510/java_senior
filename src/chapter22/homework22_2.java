package chapter22;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/7/11 0011.
 */
public class homework22_2 {
    public static void main(String[] args){
        StringBuilder result = new StringBuilder();
        String filename = args[0];
        System.out.println(filename);
        File file = new File(filename);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = result.toString();
        String[] words = text.split("[ \n\t\r.,;:!?(){]");
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<words.length;i++){
            String key = words[i].toLowerCase();
            if (key.length()>0){
                if(map.get(key)==null){
                    map.put(key,1);
                }
                else {
                    int value = map.get(key).intValue();
                    value++;
                    map.put(key,value);
                }
            }
        }
        Set<Map.Entry<String,Integer>> enterSet = map.entrySet();
        for(Map.Entry<String,Integer> entry:enterSet)
            System.out.println(entry.getValue() + "\t" + entry.getKey());
    }
}
