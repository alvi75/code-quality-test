import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start,long end){
        List<TimeRange> timeRanges = new ArrayList<>();
        long startTime = start;
        while(startTime < end){
            long endTime = Math.min(end,startTime + FETCH_DATA_DURATION);
            timeRanges.add(new TimeRange(startTime,endTime));
            startTime = endTime;
        }
        return timeRanges;
    }
}