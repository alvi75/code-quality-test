import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start, long end) {
        List<TimeRange> timeRanges = new ArrayList<>();
        if (start > end) {
            throw new IllegalArgumentException("Start time must be less than or equal to end time.");
        }
        long duration = end - start;
        if (duration < FETCH_DATA_DURATION) {
            return Collections.singletonList(new TimeRange(start, end));
        } else {
            long interval = duration / FETCH_DATA_DURATION;
            for (int i = 0; i < FETCH_DATA_DURATION; i++) {
                long startTime = start + i * interval;
                long endTime = startTime + interval;
                timeRanges.add(new TimeRange(startTime, endTime));
            }
            return timeRanges;
        }
    }
}