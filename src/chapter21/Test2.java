package chapter21;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/1 0001.
 */
public class Test2 {
    public static void main(String[] args){
        ArrayList<Date> dates = new ArrayList<Date>();
        dates.add(new Date());
        Date date = dates.get(0);
        System.out.print(date);
    }
}
