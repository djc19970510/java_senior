package chapter22;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by dingjiacheng on 2017/7/12.
 */
public class homework22_5 {
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

        String[] resultarray = (result.toString()).split("[ \n\t\n.,;:!?(){]");
        Set<String> treeset = new TreeSet<String>();
        for (int i=0;i<resultarray.length;i++){
            if(resultarray[i].length()>0){
                treeset.add(resultarray[i]);
            }
        }
        for (Object object:treeset) {
            System.out.println(object);
        }
    }
}
