import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    public void add(LoggingEvent event){
    if (eventQueue.size() == bufferSize) {
      // Remove first element of queue.
      LoggingEvent first = eventQueue.poll();
      if(first != null) {
        fileCount--;
      }
    }

    eventQueue.offer(event);
    fileCount++;
  }
}