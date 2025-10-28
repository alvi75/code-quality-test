import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start,long end){
        if(start >= end) {
            return Collections.emptyList();
        }
        
        long fetchDuration = getFetchDataDuration();
        int num = (int)Math.ceil((end - start)/fetchDuration);
        List<TimeRange> result = new ArrayList<>(num);
        for(int i=0;i<num;i++) {
            TimeRange range = new TimeRange();
            range.setStart(start + i*fetchDuration);
            range.setEnd(range.getStart() + fetchDuration);
            result.add(range);
        }

        return result;
    }
}