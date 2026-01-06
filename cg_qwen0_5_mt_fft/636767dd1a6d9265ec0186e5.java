import java.util.*;

public class Generated_636767dd1a6d9265ec0186e5 {
    /**Add the given target channels to the consumeTargets.**/
    public void addNewTarget(Channels channels,IConsumer consumer){
        if (channels == null || channels.isEmpty()) {
            return;
        }
        for (Channel channel : channels) {
            if (channel instanceof ChannelGroup) {
                ((ChannelGroup) channel).addNewTarget(consumer);
            } else {
                consumer.add(channel, this);
            }
        }
    }
}