import java.util.*;

public class Generated_636767dd1a6d9265ec0186e5 {
    /**Add the given target channels to the consumeTargets.**/
    public void addNewTarget(Channels channels,IConsumer consumer){
        if(consumers.contains(consumer)) return;
        consumers.add(consumer);
        for (int i = 0; i < channels.size(); i++) {
            Channels ch = channels.get(i);
            if(ch instanceof IChannel) {
                IChannel c = (IChannel)ch;
                if(c instanceof IConsumer)
                    ((IConsumer)c).addNewTarget(this,consumer);
            }
        }
    }
}