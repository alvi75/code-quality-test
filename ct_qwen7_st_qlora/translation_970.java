import java.util.*;

public class Translation970 {
    public String toString() {
    final StringBuffer sb = new StringBuffer();
    sb.append( "[SXPI]\n" );
    for(int i=0;
    i<_fieldInfos.length;
    i++) {
        sb.append(" item[").append( i ).append( "]=").append(_fieldInfos[ i ].toString());
    }
    sb.append( "[/SXPI]\n" );
    return sb.toString();
}
}