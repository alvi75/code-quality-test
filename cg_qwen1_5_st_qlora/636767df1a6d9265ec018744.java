import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    /**Split time ranges to insure the start time and end time is small than FETCH_DATA_DURATION.*/
    List<TimeRange> result = new ArrayList<>();
    long startTime = start;
    long endTime = end;

    while (endTime - startTime > FETCH_DATA_DURATION) {
      int splitIndex = Math.min(FETCH_DATA_DURATION, (int)(endTime - startTime));
      TimeRange range = new TimeRange(startTime, startTime + splitIndex);
      result.add(range);

      startTime += splitIndex;
      endTime -= splitIndex;
    }

    if (startTime < endTime) {
      TimeRange range = new TimeRange(startTime, endTime);
      result.add(range);
    }
    return result;
  }
}