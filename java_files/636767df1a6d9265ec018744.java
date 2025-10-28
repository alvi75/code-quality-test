import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start, long end) {
        List<TimeRange> ranges = new ArrayList<>();
        if (start > end) {
            throw new IllegalArgumentException("Start time must be less than or equal to end time.");
        }
        if (start < 0 || end < 0) {
            throw new IllegalArgumentException("Start and end times must be positive numbers.");
        }

        // Split the range into smaller ranges.
        while (start <= end) {
            TimeRange range = new TimeRange(start, Math.min(end, start + FETCH_DATA_DURATION));
            ranges.add(range);
            start += FETCH_DATA_DURATION;
        }
        return ranges;
    }
}