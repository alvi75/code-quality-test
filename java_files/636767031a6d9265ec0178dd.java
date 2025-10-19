import java.util.*;

public class Generated_636767031a6d9265ec0178dd {
    public long contentLength(){
        try {
            String contentLength = getHeader("Content-Length");
            if (contentLength != null) {
                return Long.parseLong(contentLength);
            }
        } catch (NumberFormatException e) {
            //ignore
        }

        return -1;
    }
}