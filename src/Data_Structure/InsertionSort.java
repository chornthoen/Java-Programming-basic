package Data_Structure;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] myList2 = {5,6,8,1,9,44,33,22,77};
        System.out.println(Arrays.toString(myList2));
        insertionSort(myList2);
        System.out.println(Arrays.toString(myList2));
    }


    public static void insertionSort(int [] list){
        for(int k = 0;k< list.length;k++){
            int temp = list[k];
            int j = k -1;
            while (j >=0 && temp <= list[j]){
                list[j+1] = list[j];
                j=j-1;
            }
            list[j+1] = temp;
        }
    }
}
