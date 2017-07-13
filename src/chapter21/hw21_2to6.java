package chapter21;

/**
 * Created by Administrator on 2017/7/1 0001.
 */
public class hw21_2to6 {
    //二分查找
    public static <E extends Comparable<E>> int binarySearch(E[] list,E key){
        int min = 0,max = list.length-1,middle = (max+min)/2;
        while (min<max){
            if(list[middle].compareTo(key)==0){
                return middle;
            }else if(list[middle].compareTo(key)>0) {
                max = middle;
                middle = (max+min)/2;
            }else{
                min = middle;
                middle = (max+min)/2;
            }
        }
        return -1;
    }

    public static <E extends Comparable<E>> void selectionSort(E[] list){
        for (int i=0;i<list.length;i++){
            int max = i;
            for (int j=i;j<list.length;j++){
                if(list[j].compareTo(list[max])<0){
                    max = j;
                }
            }
            E tmp = list[i];
            list[i] = list[max];
            list[max] = tmp;
        }
    }

    public static void main(String[] args){
        Integer[] test = {3,2,7,4,8,6,1};
        selectionSort(test);
        for (int i=0;i<test.length;i++){
            System.out.print(test[i]);
        }
    }
}
