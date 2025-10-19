import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start,long end){
		List<TimeRange> timeRanges = new ArrayList<>();
		TimeRange current = null;
		long lastStart = 0L;
		for (long t : TimeUtils.getInterval(start,end,FETCH_DATA_DURATION)){
			if(current == null || current.getEnd() < t){
				current = new TimeRange(lastStart,t);
				timeRanges.add(current);
			}
			lastStart = t;
		}
		return timeRanges;
	}
}