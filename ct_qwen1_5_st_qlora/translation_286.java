import java.util.*;

public class Translation286 {
    @Override public boolean equals(Object obj) {
    if ( this == obj ) return true;
    if ( obj == null ) return false;
    if ( getClass() != obj.getClass() ) return false;
    if ( index != obj.getIndex() ) return false;
    if ( format == null ) {
        if ( ((HSSFCellStyle) obj).getFormat() != null ) return false;
    }
    else if ( !format.equals( ((HSSFCellStyle) obj).getFormat() ) ) return false;
    return true;
}
}