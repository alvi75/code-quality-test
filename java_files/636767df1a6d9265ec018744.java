import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start,long end){
		long duration = end-start;
		if(duration < FETCH_DATA_DURATION){
			return Collections.singletonList(new TimeRange(start,end));
		}
		
		List<TimeRange> result = new ArrayList<>();
		TimeRange last = null;
		while(end-start > FETCH_DATA_DURATION){
			last = new TimeRange(start,end);
			result.add(last);
			start += FETCH_DATA_DURATION;
			end -= FETCH_DATA_DURATION;
		}
		if(last != null){
			result.add(last);
		}
		return result;
	}
}