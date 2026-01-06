import java.util.*;

public class Generated_636767031a6d9265ec0178dd {
    public long contentLength(){
        String contentLength = getHeader(CONTENT_LENGTH);
        if(contentLength == null){
            return 0;
        }
        try{
            return Long.parseLong(contentLength);
        }catch(NumberFormatException e){
            return 0;
        }
    }
}