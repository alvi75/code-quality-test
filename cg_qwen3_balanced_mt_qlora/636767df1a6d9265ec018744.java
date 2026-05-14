import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    /**Split time ranges to insure the start time and end time is small than FETCH_DATA_DURATION.*/
    protected List<TimeRange> buildTimeRanges(long start, long end) {
        List<TimeRange> timeRanges = new ArrayList<>();
        long startTime = start;
        long endTime = start + FETCH_DATA_DURATION;
        while (endTime <= end) {
            if (startTime < endTime) {
                timeRanges.add(new TimeRange(startTime, endTime));
            }
            startTime += FETCH_DATA_DURATION;
            endTime += FETCH_DATA_DURATION;
        }
        return timeRanges;
    }
}