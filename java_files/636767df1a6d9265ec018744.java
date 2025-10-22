import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    /**
 * /**Split time ranges to insure the start time and end time is small than FETCH_DATA_DURATION.
 **/
protected List<TimeRange> buildTimeRanges(long start, long end) {
        List<TimeRange> timeRanges = new ArrayList<>();
        if (start < 0 || end < 0) {
            return timeRanges;
        }
        long duration = end - start;
        if (duration <= FETCH_DATA_DURATION) {
            timeRanges.add(new TimeRange(start, end));
            return timeRanges;
        }

        long splitDuration = FETCH_DATA_DURATION / 2;
        long splitStart = start;
        long splitEnd = start + splitDuration;

        while (splitEnd <= end) {
            timeRanges.add(new TimeRange(splitStart, splitEnd));
            splitStart += splitDuration;
            splitEnd += splitDuration;
        }

        if (splitStart != end) {
            timeRanges.add(new TimeRange(splitStart, end));
        }

        return timeRanges;
    }
}