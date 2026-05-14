import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    /**Split time ranges to insure the start time and end time is small than FETCH_DATA_DURATION.**/
    protected List<TimeRange> buildTimeRanges(long start,long end){
        long duration = end - start;
        if (duration < 0) {
            throw new IllegalArgumentException("start time must be less than end time");
        }
        if (duration <= FETCH_DATA_DURATION) {
            return Collections.singletonList(new TimeRange(start, end));
        } else {
            List<TimeRange> result = new ArrayList<>();
            while (end > start) {
                long nextStart = Math.min(end - FETCH_DATA_DURATION, start);
                result.add(new TimeRange(nextStart, end));
                end = nextStart;
            }
            return result;
        }
    }
}