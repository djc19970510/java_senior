package chapter22;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/7/11 0011.
 */
public class homework22_1 {
    public static void main(String[] args){
        String[] strings1 = {"George","Jim","John","Blake","Kevin","Mechael"};
        String[] strings3 = {"George","Jim","John","Blake","Kevin","Mechael"};
        String[] strings4 = {"George","Jim","John","Blake","Kevin","Mechael"};
        String[] strings2 = {"George","Katie","Kevin","Mechael","Ryan"};
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        Set<String> set3 = new HashSet<String>();
        Set<String> set4 = new HashSet<String>();
        Collections.addAll(set1,strings1);
        Collections.addAll(set2,strings2);
        Collections.addAll(set3,strings3);
        Collections.addAll(set4,strings4);
        System.out.println(set1);
        System.out.println(set2);
        //并
        set1.addAll(set2);
        System.out.println(set1);
        //差
        set3.removeAll(set2);
        System.out.println(set3);
        //交
        set4.retainAll(set2);
        System.out.println(set4);
    }
}
