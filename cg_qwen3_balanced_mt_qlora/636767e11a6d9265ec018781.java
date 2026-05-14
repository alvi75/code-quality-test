import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override public void accept(final METRICS data) {
    final String key = data.getKey();
    final METRICS oldData = this.data.get(key);
    if (oldData == null) {
      this.data.put(key, data);
    } else {
      final METRICS newData = oldData.combine(data);
      if (newData != null) {
        this.data.put(key, newData);
      }
    }
  }
}