import java.util.*;

public class Translation970 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append( "[SXPI]\n" );
    for ( int i = 0 ;
    i < _fieldInfos.length ;
    i++ ) {
        sb.append( " item[" ).append( i ).append( "]=" );
        _fieldInfos[i].appendDebugInfo( sb );
        sb.append( "\n" );
    }
    sb.append( "[/SXPI]\n" );
    return sb.toString();
}
}