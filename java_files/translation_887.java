import java.util.*;

public class Translation887 {
    public Record get_next() throws IOException {
    if ( _nextIndex >= _list.size() ) {
        throw new IOException("Attempt to read past end of record stream");
    }
    return (Record) _list.get(_nextIndex++);
}
}