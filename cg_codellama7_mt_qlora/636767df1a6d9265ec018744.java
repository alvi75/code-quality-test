import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start, long end) {
    List<TimeRange> timeRanges = new ArrayList<TimeRange>();
    long startTime = start;
    long endTime = start + FETCH_DATA_DURATION;
    while (endTime <= end) {
      timeRanges.add(new TimeRange(startTime, endTime));
      startTime = endTime;
      endTime = startTime + FETCH_DATA_DURATION;
    }
    return timeRanges;
  }
}