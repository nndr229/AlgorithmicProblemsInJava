package BinarySearch;
// Binary Search is only for Sorted Arrays
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binarySearch(3,arr));
        System.out.println(binarySearchRecursive(arr, 5));
    }
    public static int binarySearch(int val, int[] array){
        int left = 0;
        int right = array.length -1 ;
        while(left <= right){
            int middle = (int) Math.floor((left + right )/ 2);
            if (array[middle] == val)
                return middle;
            else if (array[middle] < val)
                left = middle + 1;
            else
                right = middle - 1;         
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] array, int val){
        return binarySearchRecursive(0, array.length-1,array,val);
    }
    public static int binarySearchRecursive(int start,int end,int[] array, int val){
        if (end < start){
            System.out.println("The element is not in the array");
            return -1;
        }

        int middle = (start+end)/2;
        if (array[middle] == val)
            return middle;
        else if (array[middle] < val)
            return binarySearchRecursive(middle+1, end, array, val);    
        else if (array[middle] > val)
            return binarySearchRecursive(start, middle-1, array, val);

        return -1;    
    }
}
