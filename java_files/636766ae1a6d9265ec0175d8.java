import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    /**Return the string that contains the content range from offset to limit(when limit is zero,the upper bound will be count-1).**/
    private String buildContentRange() {
        StringBuilder sb = new StringBuilder();
        if (offset != 0)
            sb.append(offset);
        else
            sb.append("*");
        sb.append(" - ");
        if (limit == 0)
            sb.append(count - 1);
        else
            sb.append(limit);
        return sb.toString();
    }
}