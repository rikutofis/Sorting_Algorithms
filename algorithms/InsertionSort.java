package algorithms;

import main.SortArray;

public class InsertionSort extends Sort {

    public InsertionSort(SortArray data) {
        super(data);
    }

    @Override
    public void sort() {
        for(int i = 0; i < data.length(); i++){

            int j = i;
            
            while(j > 0 && data.get(j-1) > data.get(j)){

                if(stop()) {
                    return;
                }
    
                data.swap(j, j-1);

                j--;
            }
        }

          if(!data.isSorted()) {
            sort();
          }
        
    }
    
}
