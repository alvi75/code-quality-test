import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    private String buildContentRange() {
        StringBuilder builder = new StringBuilder();
        builder.append("bytes ").append(offset).append("-").append(limit == 0 ? totalSize - 1 : limit);
        builder.append("/").append(totalSize);
        return builder.toString();
    }
}