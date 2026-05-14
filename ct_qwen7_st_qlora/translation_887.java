import java.util.*;

public class Translation887 {
    public Record getNext() throws RecordFormatException {
    if (_nextIndex >= _list.size()) {
        throw new EOFException();
    }
    _countRead++;
    return _list.get(_nextIndex++);
}
}