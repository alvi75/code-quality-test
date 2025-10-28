import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    /**
     * Accept the data into the buffer if its id does not exist in the buffer. Otherwise try to combine it with the existing value, and remove it if the combined is abandoned.
     */
    @Override
    public void accept(final METRICS data) {
        final String key = data.getKey();
        final int index = _buffer.indexOf(key);
        if (index == -1) {
            _buffer.add(data);
        } else {
            final METRICS oldData = _buffer.get(index);
            if (!oldData.isAbandoned()) {
                //combine the two values
                final METRICS newData = new METRICS(oldData, data);
                _buffer.set(index, newData);
            }
            //remove the old one
            _buffer.remove(index);
        }
    }
}