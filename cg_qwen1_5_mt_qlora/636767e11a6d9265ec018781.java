import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    /**Accept the data into the buffer if its id does not exist in the buffer. Otherwise try to combine it with the existing value, and remove it if the combined is abandoned.**/
	@Override public void accept(final METRICS data){
		if(!this.buffer.containsKey(data.id)){
			this.buffer.put(data.id,data);
		}else{
			METRICS old = this.buffer.get(data.id);
			data.combine(old);
			if(data.isAbandoned()){
				this.buffer.remove(data.id);
			}
		}
	}
}