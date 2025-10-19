import java.util.*;

public class Generated_636767dd1a6d9265ec0186e5 {
    public void addNewTarget(Channels channels,IConsumer consumer){
        if(consumer instanceof IChannelConsumer) {
            for (IChannel channel : ((IChannelConsumer)consumer).getChannels()) {
                addNewTarget(channels,channel);
            }
        }else{
            addNewTarget(channels,(IConsumer)consumer);
        }

    }
}