import java.util.*;

public class Generated_636767031a6d9265ec0178dd {
    /**Compute and return the length of the request content header, return the content length if NumberFormatException happens.**/
    public long contentLength(){
        try {
            return Long.parseLong(content.length());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}