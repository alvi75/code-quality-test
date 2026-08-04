import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data){
        if(data == null)
            return;
        final String id = data.getId();
        if(id == null)
            return;
        final METRICS existing = buffer.get(id);
        if(existing == null){
            buffer.put(id, data);
        }else{
            final METRICS combined = combine(existing, data);
            if(combined == null)
                buffer.remove(id);
            else
                buffer.put(id, combined);
        }
    }
}