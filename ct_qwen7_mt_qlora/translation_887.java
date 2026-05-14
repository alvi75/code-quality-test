import java.util.*;

public class Translation887 {
    1 public Record getFirst() {
    2 if (_firstIndex < 0)3 throw new RuntimeException("Attempt to read past end of record stream");
    4 return (Record) _list.get(_firstIndex);
    5 }
}