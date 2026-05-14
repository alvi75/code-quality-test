import java.util.*;

public class Generated_636767031a6d9265ec0178dd {
    public long contentLength(){
        String contentLengthHeader = headers.get("Content-Length");
        try{
            return Long.parseLong(contentLengthHeader);
        }catch (NumberFormatException nfe){
            //ignore it.
        }
        return 0;
    }
}