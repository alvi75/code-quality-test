import java.util.*;

public class Generated_636767dd1a6d9265ec0186e5 {
    public void addNewTarget(Channels channels,IConsumer consumer){
		if(consumers.containsKey(consumer)){
			consumers.get(consumer).add(channels);
		}
		else{
			consumers.put(consumer,new ArrayList<Channels>());
			consumers.get(consumer).add(channels);
		}
	}
}