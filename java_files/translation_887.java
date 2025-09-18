import java.util.*;

public class Translation887 {
    public org.apache.poi.hssf.record.Record getNext() {
    if (_nextIndex >= _list.size()) {
        throw new IllegalStateException("Attempt to read past the end of the list");
    }
    org.apache.poi.hssf.record.Record returnRecord = _list.get(_nextIndex);
    _countRead++;
    returnRecord.setRecordId(_nextRecordId);
    _nextRecordId = getRecordId();
    return returnRecord;
}
}