import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start,long end){
        List<TimeRange> result = new ArrayList<>();
        long duration = end - start;
        if(duration > FETCH_DATA_DURATION){
            for(int i=0;i<=duration/FETCH_DATA_DURATION;i++){
                TimeRange range = new TimeRange();
                range.setStart(start + i*FETCH_DATA_DURATION);
                range.setEnd(Math.min(end,range.getStart() + FETCH_DATA_DURATION));
                result.add(range);
            }
        }else{
            TimeRange range = new TimeRange();
            range.setStart(start);
            range.setEnd(end);
            result.add(range);
        }

        return result;
    }
}