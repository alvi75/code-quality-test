import java.util.*;

public class Translation44 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    int length = getPathCount();
    buffer.append( ' ' );
    for ( int i = 0;
    i < length;
    i++ ) {
        buffer.append( getComponent( i ) );
        if ( i < ( length - 1 ) ) {
            buffer.append( ' ' );
        }
    }
    return buffer.toString();
}
}