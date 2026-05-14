import java.util.*;

public class Generated_636767461a6d9265ec017d0e {
    private Pair<List<Integer>,Long> computeSuffixSum(List<Integer> bounds){
        int size = bounds.size();
        List<Integer> lowerBoundIndices=new ArrayList<>(size);
        long total=0;
        for(int i=size-1;i>=0;--i){
            if(i==size-1)
                total+=bounds.get(i);
            else{
                //compute new total by adding current element to previous total.
                total+=bounds.get(i)+lowerBoundIndices.get(size-i-1);
            }
            lowerBoundIndices.add(i,total);
        }

        return new Pair<>(lowerBoundIndices, total);
    }
}