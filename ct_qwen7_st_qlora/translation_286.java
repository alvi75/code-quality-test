import java.util.*;

public class Translation286 {
    public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( !( o instanceof HSSFCellStyle ) ) return false;
    HSSFCellStyle other = (HSSFCellStyle) o;
    if ( _format == null ) {
        if ( other._format != null ) return false;
    }
    else if ( !_format.equals( other._format ) ) return false;
    if ( index != other.index ) return false;
    return true;
}
}