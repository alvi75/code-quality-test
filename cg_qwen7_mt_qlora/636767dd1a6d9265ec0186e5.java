import java.util.*;

public class Generated_636767dd1a6d9265ec0186e5 {
    /**Add the given target channels to the consumeTargets.*/
public void addNewTarget(Channels channels,IConsumer consumer){
		if (channels==null) return;
		for (Channel channel:channels.getChannels()){
			addNewTarget(channel,consumer);
		}
	}
}