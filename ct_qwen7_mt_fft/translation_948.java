import java.util.*;

public class Translation948 {
    public int findEndOffset(StringBuilder buffer, int start) {
    if(start>buffer.length()||start<0)return start;
    final int max = Math.min(start+boundaryLength, buffer.length());
    for(int i=start;
    i<max;
    i++) {
        if(boundaryChars.contains(buffer.charAt(i))) {
            return i;
        }
    }
    return start;
}
}