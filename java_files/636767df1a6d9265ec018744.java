import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start, long end) {
        List<TimeRange> timeRanges = new ArrayList<>();
        if (start > end)
            return timeRanges;
        int count = 0;
        long lastEndTime = start - 1;
        for (long i = start; i <= end; i += FETCH_DATA_DURATION) {
            long endTime = Math.min(i + FETCH_DATA_DURATION - 1, end);
            if (endTime - lastEndTime < FETCH_DATA_DURATION) {
                count++;
            } else {
                timeRanges.add(new TimeRange(lastEndTime, endTime));
                lastEndTime = endTime;
                count = 0;
            }
        }

        if (count != 0) {
            timeRanges.add(new TimeRange(lastEndTime, end));
        }
        return timeRanges;
    }
}