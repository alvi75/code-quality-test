import java.util.*;

public class Translationtranslation_948 {
    public int findEndOffset(StringBuilder buffer, int start) {
        if( start > buffer.length() || start < 1 ) return start;
        int offset, count = maxScan;
        for( offset = start;
        offset > 0 && count > 0;
        count-- ){
            if( boundaryChars.contains( buffer.charAt( offset - 1 ) ) ) return offset;
            offset--;
        }
        return start;
    }
}