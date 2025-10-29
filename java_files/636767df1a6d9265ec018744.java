import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    /**Split time ranges to insure the start time and end time is small than FETCH_DATA_DURATION.**/
	protected List<TimeRange> buildTimeRanges(long start, long end) {
		List<TimeRange> result = new ArrayList<>();
		long duration = end - start;
		if (duration < FETCH_DATA_DURATION) {
			result.add(new TimeRange(start, end));
			return result;
		}
		long step = FETCH_DATA_DURATION / 10;
		while (start + step <= end) {
			result.add(new TimeRange(start, start + step));
			start += step;
		}
		result.add(new TimeRange(start, end));
		return result;
	}
}