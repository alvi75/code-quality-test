import java.util.*;

public class Translation604 {
    public List<Head> getNextHeads( char c ) {
    if ( matches( c ) ) {
        return nextHeads;
    }
    else {
        return FileNameMatcher.EMPTY_HEAD_LIST;
    }
}
}