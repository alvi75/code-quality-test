import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start,long end){
		List<TimeRange> timeRanges = new ArrayList<TimeRange>();
		
		long startTime = start;
		long endTime = end;
		while(startTime < endTime){
			TimeRange tr = TimeRange.build(startTime,endTime);
			timeRanges.add(tr);
			
			startTime += FETCH_DATA_DURATION;
			endTime += FETCH_DATA_DURATION;
		}
		
		return timeRanges;
	}
}