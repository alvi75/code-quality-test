import java.util.*;

public class Translation887 {
    public Record getNext() {
    if (nextIndex >= list.size()) {
        throw new IllegalStateException("Attempt to read past end of record stream");
    }
    countRead++;
    return (Record)list.get(nextIndex++);
}
}