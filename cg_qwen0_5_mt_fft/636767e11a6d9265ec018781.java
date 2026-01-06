import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data) {
        final String key = data.key;
        final Object value = data.value;

        //if (key == null || key.isEmpty()) return; // do nothing

        synchronized (this) {
            if (!buffer.containsKey(key)) {
                buffer.put(key, value);
            } else {
                //if (value instanceof Map) {
                    //if ((Map<String, Object>) value).containsKey("abandoned")) {
                        //if (((Map<String, Object>) value).get("abandoned").equals("true")) {
                            //buffer.remove(key); //remove old entry
                            //buffer.put(key, value); //add new one
                        //}
                    //} else {
                        //buffer.put(key, value); //add new one
                    //}
                //} else {
                    //buffer.put(key, value); //add new one
                //}
            }
        }

        notifyAll();
    }
}