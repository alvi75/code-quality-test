import java.util.*;

public class Generated_6367667e1a6d9265ec01743a {
    public long lastWriteTimeStampInMilliseconds(){
		long result = -1;
		if(this.lastWriteTimestamp == -1){
			result = -1;
		}else{
			result = this.lastWriteTimestamp.getTime();
		}
		return result;
	}
}