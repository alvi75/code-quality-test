import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start,long end){
		List<TimeRange> result = new ArrayList<>();
		long diff = end-start;
		if(diff < FETCH_DATA_DURATION) {
			result.add(new TimeRange(start, start+FETCH_DATA_DURATION));
		}
		else if(diff > FETCH_DATA_DURATION*2) {
			result.add(new TimeRange(start, start+FETCH_DATA_DURATION*2));
		}
		else{
			result.add(new TimeRange(start, start+diff));
		}
		return result;
	}
}