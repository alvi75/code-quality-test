import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    private String buildContentRange(){
        if(contentLength==0){
            return "bytes */"+count;
        }
        else{
            long l=Math.min(count, contentLength);
            return "bytes "+offset+"-"+(l-1)+" of "+contentLength;
        }
    }
}