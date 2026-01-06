import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start,long end){
		List<TimeRange> ret = new ArrayList<TimeRange>();
		long duration = end-start;
		if(duration < 1000){
			return ret;
		}
		
		long interval = (duration/1000);
		long nextInterval = interval+1;
		while(interval < FETCH_DATA_DURATION){
			TimeRange tr = new TimeRange(start, Math.min(end, start+interval));
			ret.add(tr);
			start += interval;
			end -= interval;
			interval = nextInterval;
		}
		return ret;
	}
}