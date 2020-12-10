import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BinPacking {
    private  final int binSize;
    private final int[] items;
    private Map<Integer,Integer> bins;
    private int binsFilledToWhat[];
    private boolean[] itemsUsed;

    public BinPacking(int binSize, int[] items) {
        this.binSize = binSize;
        this.items = items;
        this.bins = new HashMap<>();
        this.binsFilledToWhat = new int[1];
        this.binsFilledToWhat[0] = 0;
        this.itemsUsed = new boolean[items.length];

        Arrays.fill(itemsUsed, false);


    }

    public void solve(){
        for(int i=0; i < items.length; i++){
            for(int j=0; j<binsFilledToWhat.length; j++){
                if(itemsUsed[i] == false) {
                    if ((items[i] <= binSize - binsFilledToWhat[j])) {

                        //System.out.println(items[i] + " " + Arrays.toString(binsFilledToWhat) + " " + j + " " + i);
                        if (bins.containsKey(j + 1)) {
                            int item = bins.get(j + 1);
                            if (items[i] <= binSize - item) {
                                bins.put(j + 1, items[i] + item);
                                binsFilledToWhat[j] = items[i] + item;
                                itemsUsed[i] = true;
                            }
                            if (i + 1 == items.length) {
                                break;
                            }
                        } else {

                            bins.put(j + 1, items[i]);
                            binsFilledToWhat[j] = items[i];
                            itemsUsed[i] = true;
                        }
                    }
                }
            }
                int[] copy = new int[binsFilledToWhat.length + 1];
                for(int z=0;z<copy.length-1;z++){
                    copy[z] = binsFilledToWhat[z];
                }
                copy[copy.length-1] = 0;
                binsFilledToWhat =  new int[i+2];
                binsFilledToWhat = copy;


        }
        Map<Integer, Integer> sortedBins = new TreeMap<>(bins);
        String out = sortedBins.toString();
        System.out.println(out);

    }




}
