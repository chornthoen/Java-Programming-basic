package Data_Structure;

public class BinarySearch {
    public static void main(String[] args) {
        int [] list = {1,3,4,5,6,7,8,9,77,55,44,22};
        int i = binarySearch(list,5);
        int j = binarySearch(list,4);
        int k = binarySearch(list,67);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
    public static int binarySearch(int [] list ,int key){
        int low = 0;
        int high = list.length-1;
        while (high>=low){
            int mid = (low+high)/2;
            if(key < list[mid]){
                high = mid -1;
            }
            else if(key == list[mid]){
                return mid;
            }
            else{
                low=mid +1;
            }
        }
        return -1;

    }

}
