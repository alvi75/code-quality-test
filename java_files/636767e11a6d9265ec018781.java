import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    /**Accept the data into the buffer if its id does not exist in the buffer. Otherwise try to combine it with the existing value, and remove it if the combined is abandoned.**/
@Override
    public void accept(final METRICS data) {
        if (data.id == -1) {
            this.buffer.add(data);
        } else {
            final int index = this.buffer.indexOf(data);
            if (index != -1) {
                this.buffer.set(index, data);
            }
        }
    }
}