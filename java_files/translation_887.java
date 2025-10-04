import java.util.*;

public class Translation887 {
    public org.apache.poi.hssf.record.Record getNext() {
    if (_nextIndex >= _list.size()) {
        throw new NoSuchElementException("Attempt to read past end of record stream");
    }
    _countRead++;
    return _list.get(_nextIndex++);
}
Create a function to calculate the sum of all elements in a given list. Preserve semantics, be idiomatic in the target language, and output only the translated code—no explanations.
}