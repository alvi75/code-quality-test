import java.util.*;

public class Generated_636767031a6d9265ec0178dd {
    public long contentLength(){
        try{
            String cl = getHeader("Content-Length");
            if(cl != null){
                return Long.parseLong(cl);
            }
        }catch(NumberFormatException e){}
        return -1;
    }
}