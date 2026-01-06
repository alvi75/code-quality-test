import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    /**
 * Split time ranges to insure the start time and end time is small than FETCH_DATA_DURATION.
 **/
protected List<TimeRange> buildTimeRanges(long start, long end) {
    List<TimeRange> timeRanges = new ArrayList<>();
    if (end - start <= FETCH_DATA_DURATION) {
      timeRanges.add(new TimeRange(start, end));
    } else {
      while (start < end) {
        long nextStart = Math.min(start + FETCH_DATA_DURATION, end);
        timeRanges.add(new TimeRange(start, nextStart));
        start = nextStart;
      }
    }
    return timeRanges;
  }
}