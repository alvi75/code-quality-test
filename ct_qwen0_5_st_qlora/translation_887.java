import java.util.*;

public class Translation887 {
    public Record getNext() throws IOException {
    if (_nextIndex >= _list.size()) {
        throw new IllegalStateException("Attempt to read past end of record stream");
    }
    _countRead++;
    return _list.get(_nextIndex++);
}
}