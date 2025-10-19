import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    public void put(LoggingEvent o){
    if (o instanceof org.apache.log4j.spi.LoggingEvent) {
      // If we're running under log4j, then make sure that our event is a
      // log4j one.
      org.apache.log4j.spi.LoggingEvent loggingEvent = (org.apache.log4j.spi.LoggingEvent)o;
      // If this is a remote logging event, then we need to convert it into
      // a NFPatternLayoutEvent so that it will be properly serialized for
      // transmission over the network.
      if(loggingEvent instanceof RemoteLoggingEvent){
        buf.put(new NFPatternLayoutEvent(loggingEvent));
      } else {
        buf.put(loggingEvent);
      }
    } else {
      buf.put(o);
    }
  }
}