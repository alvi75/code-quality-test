import java.util.*;

public class Generated_636767dd1a6d9265ec0186e5 {
    public void addNewTarget(Channels channels,IConsumer consumer){
        if (channels == null) {
            return;
        }
        synchronized (this.channels) {
            this.channels.put(consumer, channels);
        }
    }
}