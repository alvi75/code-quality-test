import java.util.*;

public class Translationtranslation_887 {
    public org.apache.poi.hssf.record.Record getNext() {
        if(_nextIndex >= _list.size()) {
            throw new IllegalStateException("Attempt to read past end of record stream");
        }
        _countRead++;
        return _list.get(_nextIndex++);
    }
}