import java.util.*;

public class Translation286 {
    public boolean equals( Object obj ) {
    if ( this==obj ) return true;
    if ( obj==null ) return false;
    if ( obj instanceof HSSFCellStyle ) {
        HSSFCellStyle other = (HSSFCellStyle)obj;
        if ( _format == null ) {
            if ( other._format != null) return false;
        }
        else if ( !_format.equals( other._format ) ) return false;
        if ( index != other.index ) return false;
        return true;
    }
    return false;
}
}