import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start,long end){
        long startTime = start;
        long endTime = end;
        int count = 0;
        List<TimeRange> result = new ArrayList<>();
        while (true) {
            if (endTime - startTime < FETCH_DATA_DURATION) {
                result.add(new TimeRange(startTime, endTime));
                break;
            } else {
                //split into two parts
                long middleTime = startTime + ((endTime - startTime) / 2);
                result.add(new TimeRange(startTime, middleTime));
                startTime = middleTime;
            }
        }
        return result;
    }
}