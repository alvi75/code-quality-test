import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    /**
     * Return the string that contains the content range from offset to limit(when limit is zero,the upper bound will be count-1) and count.
     */
    private String buildContentRange() {
        StringBuilder sb = new StringBuilder();
        if (offset != 0 || limit != 0) {
            sb.append("bytes ").append(offset).append("-").append(limit == 0 ? count - 1 : limit);
        }
        return sb.toString();
    }
}