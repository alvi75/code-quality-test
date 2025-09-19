import java.util.*;

public class Translation887 {
    ublic org.apache.poi.hssf.record.Record getNext() {
    if(_nextIndex >= _list.size()) {
        throw new IndexOutOfBoundsException("Attempt to read past end of record stream");
    }
    _countRead++;
    return _list.get(_nextIndex++);
}
}