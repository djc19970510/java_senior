package chapter22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by dingjiacheng on 2017/7/11.
 */
public class homework22_4 {
    public static void main(String[] args){
        String[] strings1 = {"George","Jim","John","Blake","Kevin","Mechael"};
        String[] strings3 = {"George","Jim","John","Blake","Kevin","Mechael"};
        String[] strings4 = {"George","Jim","John","Blake","Kevin","Mechael"};
        String[] strings2 = {"George","Katie","Kevin","Mechael","Ryan"};
        List<String> set1 = new ArrayList<String>();
        List<String> set2 = new ArrayList<String>();
        List<String> set3 = new ArrayList<String>();
        List<String> set4 = new ArrayList<String>();
        List<String> set5 = new ArrayList<String>();
        Collections.addAll(set1,strings1);
        Collections.addAll(set2,strings2);
        Collections.addAll(set3,strings3);
        Collections.addAll(set4,strings4);
        System.out.println(set1);
        System.out.println(set2);
        //并
        for (int i=0;i<set2.size();i++){
            if(!set1.contains(set2.get(i))){
                set1.add(set2.get(i));
            }
        }
        System.out.println(set1);
        //差
        for (int i=0;i<set2.size();i++){
            if(set3.contains(set2.get(i))){
                set3.remove(set2.get(i));
            }
        }
        System.out.println(set3);
        //交
        for (int i=set2.size()-1;i>=0;i--){
            if(!set4.contains(set2.get(i))){
                set2.remove(set2.get(i));
            }
        }
        for (int i=set4.size()-1;i>=0;i--){
            if(!set2.contains(set4.get(i))){
                set2.remove(set4.get(i));
            }
        }
        System.out.println(set2);
    }
}
