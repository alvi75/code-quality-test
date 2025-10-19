import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data){
        final String key = data.getId();
        final METRICS oldData = this.buffer.get(key);
        if(oldData == null) {
            this.buffer.put(key,data);
        } else {
            final METRICS newData = oldData.combine(data);
            if(newData.isAbandoned()) {
                this.buffer.remove(key);
            }
            else {
                this.buffer.put(key,newData);
            }
        }
    }
}