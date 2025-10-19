import java.util.*;

public class Generated_636767031a6d9265ec0178dd {
    public long contentLength(){
        try{
            return Long.parseLong(this.header("Content-Length"));
        }catch(NumberFormatException e){
            return this.content.length;
        }
    }
}