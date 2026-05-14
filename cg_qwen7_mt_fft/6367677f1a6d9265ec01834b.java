import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    public void put(LoggingEvent o) {
    if (o instanceof ScheduledFileRollEvent) {
      super.put(o);
      return;
    }
    long timeStamp = ((LoggingEventBase)o).getTimeStamp();
    int index = getIndex(timeStamp);

    // check to see if we need to roll the file over.
    if(isTimeToRoll(index)) {
      rollOver(index);
    }

    super.put(o);
  }
}