package TowerOfHanoi;
public class TowerOfHanoi {
    public static void main(String[] args) {    
        towerOfHanoi("A", "B", "C", 3);
    }

    public static void towerOfHanoi(String start, String aux, String end,int numDisks){
        if (numDisks==1){
            System.out.println("Moving Plate 1 from "+start+" to "+end);
            return;
        }
        towerOfHanoi(start, end, aux, numDisks-1);
        System.out.println("Moving Plate "+(numDisks)+" from "+start+" to "+end);
        towerOfHanoi(aux, start, end, numDisks-1);
    } 
}
