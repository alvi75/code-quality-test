import java.util.*;

public class Translation887 {
    ublic final Record getNext() {
    if (_nextIndex >= _list.size()) {
        throw new RuntimeException("Attempt to Read past end of record stream");
    }
    _countRead++;
    return _list.get(_nextIndex++);
}
}