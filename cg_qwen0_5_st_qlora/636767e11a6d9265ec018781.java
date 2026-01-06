import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data){
        final String key = data.getMetric().getKey();
        if(!buffer.containsKey(key)){
            buffer.put(key, data);
        }else{
            //combine the values
            final String oldKey = buffer.keySet().iterator().next();
            final double oldVal = buffer.get(oldKey).getValue();
            final double newVal = data.getValue();
            final double delta = newVal - oldVal;
            if(delta > 0){
                buffer.put(oldKey, new METRICS(data.getMetric(), delta));
            }else{
                buffer.remove(oldKey);
            }
        }
    }
}