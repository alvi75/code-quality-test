import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
  public void accept(final METRICS data){
    final long now = System.currentTimeMillis();
    final String key = data.getKey();

    // If we have a previous entry for this key, then check whether or not we should merge them.
    if (this.buffer.containsKey(key)){
      final METRICS oldData = this.buffer.get(key);
      final long oldTime = oldData.getTime();
      final long newTime = data.getTime();

      // If the old time is older than the new one, then replace the old data with the new data.
      if(oldTime < newTime){
        this.buffer.put(key, data);

        // If the old time is newer than the new one, then merge the two together.
      } else {
        final METRICS mergedData = this.merge(data, oldData);
        if(mergedData != null){
          this.buffer.remove(key);
          this.buffer.put(key, mergedData);
        }
      }

      // If there was no previous entry for this key, then just add it to the map.
    } else {
      this.buffer.put(key, data);
    }

    // Remove any entries that are too old from the buffer.
    this.cleanup(now);
  }
}