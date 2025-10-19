import java.util.*;

public class Generated_636767dd1a6d9265ec0186e5 {
    /**Add the given target channels to the consumeTargets.
@throws IllegalArgumentException if the channel is null or not a valid channel name*/
public void addNewTarget(Channels channels,IConsumer consumer){
        if(channels==null || !channels.isValid()){
            throw new IllegalArgumentException("Invalid channel");
        }
        synchronized (this) {
            this.consumeTargets.put(channels,consumer);
        }
    }
}