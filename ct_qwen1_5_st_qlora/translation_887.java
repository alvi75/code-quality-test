import java.util.*;

public class Translation887 {
    public final Record getNext() throws IOException {
    if (_nextIndex >= _list.size()) {
        throw new EOFException("End of record stream reached");
    }
    _countRead++;
    return _list.get(_nextIndex++);
}
}