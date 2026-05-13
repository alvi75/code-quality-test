import java.util.*;

public class Translation286 {
    public boolean equals( Object o ) {
    if(this == o) {
        return true;
    }
    if(o == null || getClass() != o.getClass()) {
        return false;
    }
    final HSSFCellStyle c = (HSSFCellStyle)o;
    if(_format == null) {
        return c._format == null;
    }
    else {
        return _format.equals(c._format);
    }
}
}