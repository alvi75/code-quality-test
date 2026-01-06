import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    private String buildContentRange(){
        if (offset == 0 && count > 0){
            return "bytes "+offset+"/"+count;
        }else if(offset>0 && count==0){
            return "bytes "+offset+"-";
        }else if(offset>0 && count>0){
            return "bytes "+offset+","+count;
        }
        return null;
    }
}