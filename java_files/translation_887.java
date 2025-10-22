import java.util.*;

public class Translation887 {
    ublic Record getNext() {
    if (_nextIndex >= _list.size()) {
        throw new RuntimeException("Attempt to Read past end of record stream");
    }
    _countRead++;
    return (Record)_list.get(_nextIndex++);
}
}