import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    public void accept(final METRICS data) {
        final int id = data.id();
        if (buffer.containsKey(id)) {
            //combine with existing value
            final double[] newBuffer = new double[buffer.size()];
            int i = 0;
            for (final double[] pair : buffer.values()) {
                newBuffer[i++] = pair[0] + pair[1];
            }
            buffer.put(id, new double[]{newBuffer[0], newBuffer[1]});
        } else {
            buffer.put(id, data.value());
        }
    }
}