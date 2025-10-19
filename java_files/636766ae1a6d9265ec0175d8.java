import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    /**Return the string that contains the content range from offset to limit(when limit is zero,the upper bound will be count-1) and count.**/
    private String buildContentRange(){
        if (offset == 0 && limit == 0){
            return "bytes*/";
        }
        else if (limit == 0){
            return "bytes=" + offset;
        }
        else{
            return "bytes=" + offset + "-" + (offset + limit - 1);
        }
    }
}