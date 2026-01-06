import java.util.*;

public class Generated_636767031a6d9265ec0178dd {
    public long contentLength() {
        try {
            String s = headers.get("Content-Length");
            if (s != null) {
                return Long.parseLong(s);
            }
        } catch (NumberFormatException e) {}
        return -1;
    }
}