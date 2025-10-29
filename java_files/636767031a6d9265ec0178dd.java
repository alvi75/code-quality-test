import java.util.*;

public class Generated_636767031a6d9265ec0178dd {
    /**Compute and return the length of the request content header, return the content length if NumberFormatException happens.*/
    public long contentLength(){
        String contentLength = getHeader(CONTENT_LENGTH);
        if (contentLength == null){
            return 0;
        }
        try{
            return Long.parseLong(contentLength);
        }catch(NumberFormatException e){
            return Long.parseLong(getHeader(CONTENT_LENGTH));
        }
    }
}