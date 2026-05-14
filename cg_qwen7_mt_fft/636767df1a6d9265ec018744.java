import java.util.*;

public class Generated_636767df1a6d9265ec018744 {
    protected List<TimeRange> buildTimeRanges(long start,long end){
    long duration = end-start;
    if(duration<=0){
      return null;
    }
    
    //split large range into multiple queries
    int splitCount = (int)(duration/(FetchDataDuration*1000));
    if(splitCount==0){
      splitCount=1;
    }

    long stepMs = duration/splitCount;

    ArrayList<TimeRange> result = new ArrayList<TimeRange>(splitCount+1);
    for(int i=0;i<splitCount;++i){
      TimeRange tr = new TimeRange(start,stepMs);
      result.add(tr);
      start+=stepMs;
    }
    //handle remainder separately
    TimeRange lastTr = new TimeRange(start,end);
    result.add(lastTr);

    return result;
  }
}