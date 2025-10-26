import java.util.*;

public class Translation887 {
    public Record getNext() throws IOException {
    if (nextIndex >= list.size()) {
        throw new EOFException("Attempt to read past end of record stream");
    }
    countRead++;
    return (Record) list.get(nextIndex++);
}
}