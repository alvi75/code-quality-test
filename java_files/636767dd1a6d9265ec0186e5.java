import java.util.*;

public class Generated_636767dd1a6d9265ec0186e5 {
    /**
     * Add the given target channels to the consumeTargets.
     */
    public void addNewTarget(Channels channels,IConsumer consumer){
        if(consumer instanceof IProducer)
            addNewTarget(channels,(IProducer)consumer);
        else
            addNewTarget(channels,null,consumer);
    }
}