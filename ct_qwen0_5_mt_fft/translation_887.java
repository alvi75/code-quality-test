import java.util.*;

public class Translation887 {
    public Record getNext() {
    if(_nextIndex >= list.size()) {
        throw new IllegalStateException("Attempt to read past end of record stream");
    }
    _countRead++;
    return (Record) list.get(_nextIndex++);
}
}