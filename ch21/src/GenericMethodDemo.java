/**
 * Created by dingjiacheng on 2017/6/18.
 * 范型方法定义方式
 */

public class GenericMethodDemo {
    public static void main(String[] agrs){
        Integer[] integers = {1,2,3,4,5};
        String[] strings = {"test1","test2","tes3"};

        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.<String>print(strings);
    }
    public static <E> void print(E[] list){
        for (int i=0;i<list.length;i++)
            System.out.print(list[i]+" ");
        System.out.println();
    }

}
