import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    /**Split time ranges to insure the start time and end time is small than FETCH_DATA_DURATION.**/
	protected List<TimeRange> buildTimeRanges(long start,long end){
		List<TimeRange> result = new ArrayList<>();
		long startTime = start;
		while(startTime < end){
			result.add(new TimeRange(startTime,Math.min(end,FETCH_DATA_DURATION)));
			startTime += FETCH_DATA_DURATION;
		}
		return result;
	}
}