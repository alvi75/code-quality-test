import java.util.*;

public class Generated_6367667e1a6d9265ec01743a {
    public long lastWriteTimeStampInMilliseconds(){
		if (lastWrite == -1){
			return -1;
		}
		
		long time = System.currentTimeMillis();
		time -= lastWrite;
		return time;
	}
}