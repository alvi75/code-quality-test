import java.util.*;

public class Translationtranslation_948 {
    public int findEndOffset(StringBuilder buffer, int start) {
        if( start > buffer.length() || start < 0 ) return start;
        int offset, count = maxScan;
        for( offset = start;
        offset < buffer.length() && count > 0;
        count-- ){
            if( boundaryChars.contains( buffer.charAt( offset ) ) ) return offset;
        }
        return start;
    }
}