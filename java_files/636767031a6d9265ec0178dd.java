import java.util.*;

public class Generated_636767031a6d9265ec0178dd {
    public long contentLength(){
        try{
            String value = getHeader("Content-Length");
            if(value != null){
                return Long.parseLong(value);
            }
        }catch(NumberFormatException e){
            //ignore
        }
        return -1;
    }
}