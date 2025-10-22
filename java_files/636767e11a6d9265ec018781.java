import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data){
        final String id = data.getId();
        if(!buffer.containsKey(id)){
            buffer.put(id, data);
        }else{
            final METRICS oldData = buffer.get(id);
            final METRICS newData = data.combine(oldData);
            if(newData == null){
                buffer.remove(id);
            }else{
                buffer.put(id, newData);
            }
        }
    }
}