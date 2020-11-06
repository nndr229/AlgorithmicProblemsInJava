package QuickSelect;
import java.util.concurrent.ThreadLocalRandom;
public class QuickSelect {
    public int[] values;
    public int output;
    QuickSelect(int[] values,int k){
        this.values = values;
        this.output = this.select(0, this.values.length-1, k);
        System.out.println(output);
    }

    public int selectRandomElement(int start, int end){
        //With Random()
        //return new Random().nextInt(start- end +1) +start;
        return ThreadLocalRandom.current().nextInt(start, end + 1);
    }

    public int partition(int indexFirst,int indexLast){
        int pivot = this.selectRandomElement(indexFirst,indexLast);
        this.swap(indexLast,pivot);

        for(int i=indexFirst; i<indexLast;i++){
            if(this.values[i] > this.values[indexLast]){
                this.swap(i,indexFirst);
                indexFirst++;
            }
        }
        this.swap(indexFirst,indexLast);

        return indexFirst;

    }

    public int select(int indexFirst, int indexLast,int k){
        int pivot = this.partition(indexFirst,indexLast);
        if(pivot > k)
            return this.select(indexFirst, pivot-1, k);
        else if(pivot<k)
            return this.select(pivot+1, indexLast, k);
        
        return this.values[k];    
    }

    public void swap(int i,int j){
        int temp = this.values[i];
        this.values[i] = this.values[j];
        this.values[j] = temp;
    }

}
