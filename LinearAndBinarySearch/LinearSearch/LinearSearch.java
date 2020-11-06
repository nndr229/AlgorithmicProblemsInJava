package LinearSearch;
public class LinearSearch {
    public static void main(String[] args) {
        int[] input = {2,3,4,1,9,6,5,8};
        System.out.println(linearSearch(100, input));
    }
    public static int linearSearch(int val, int[] array){
        for (int i =0; i< array.length ; i++){
            if (array[i] == val){
                return i;
            }
        }
        return -1;
    }

}
