import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    private String buildContentRange(){
        if (limit == 0){
            return "bytes "+offset+"-"+(count-1)+"/*";
        }else{
            return "bytes "+offset+"-"+(limit+offset-1)+"/"+count;
        }
    }
}