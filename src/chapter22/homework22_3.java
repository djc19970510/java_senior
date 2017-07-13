package chapter22;

import java.io.*;
import java.util.*;

/**
 * Created by dingjiacheng on 2017/7/11.
 */
public class homework22_3 {
    public static void main(String[] args){
        String filepath = "C:\\Users\\dingjiacheng\\IdeaProjects\\java_senior_source\\src\\chapter22\\Java_Case_Phrase";
        List<String> list = new ArrayList<String>();
        FileReader reader = null;
        String str = null;
        String totaltmp = "";
        Map<String,Integer> map = new HashMap<>();
        try {
            reader = new FileReader(filepath);
            BufferedReader br = new BufferedReader(reader);

            while((str = br.readLine()) != null) {
                list.add(str);
            }
            br.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String codepath = args[0];
        try {
            reader = new FileReader(codepath);
            BufferedReader br = new BufferedReader(reader);
            while((str = br.readLine()) != null) {
                totaltmp+=(str+"\n");
            }
            String[] tmp = totaltmp.split("[ \n\t\n.,;:!?(){}<>+=*/]");
            for (int i=0;i<tmp.length;i++){
                if (tmp[i].length()>0){
                    if(list.contains(tmp[i])){
                        if(map.get(tmp[i])==null){
                            map.put(tmp[i],1);
                        }
                        else {
                            int value = map.get(tmp[i]).intValue();
                            value++;
                            map.put(tmp[i],value);
                        }
                    }
                }
            }
            Set<Map.Entry<String,Integer>> enterSet = map.entrySet();
            for(Map.Entry<String,Integer> entry:enterSet)
                System.out.println(entry.getValue() + "\t" + entry.getKey());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
