package Data_Structure;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        double[] myList ={30,3,2,5,6,8,9,1,7,10,50,40,30,34};
        System.out.println(Arrays.toString(myList));
        selectionSort(myList);
        System.out.println(Arrays.toString(myList));
    }
    public static void selectionSort(double [] list){
        for(int i = list.length-1;i>=1;i--){
            double  currentMax = list[0];
            int currentMaxIndex = 0;
            for(int j =1;j<=i;j++){
                if(currentMax<list[j]){
                    currentMax = list[j];
                    currentMaxIndex= j;
                }
            }
            if(currentMaxIndex!=i){
                list[currentMaxIndex]=list[i];
                list[i]=currentMax;
            }
        }
    }
}
