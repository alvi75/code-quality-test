import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    /**Split time ranges to insure the start time and end time is small than FETCH_DATA_DURATION.*/
    protected List<TimeRange> buildTimeRanges(long start, long end) {
        List<TimeRange> timeRanges = new ArrayList<>();
        long startTime = start;
        while (startTime < end) {
            long endTime = Math.min(startTime + FETCH_DATA_DURATION, end);
            timeRanges.add(new TimeRange(startTime, endTime));
            startTime += FETCH_DATA_DURATION;
        }
        return timeRanges;
    }
}