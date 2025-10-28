import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    private String buildContentRange(){
        if (offset == 0 && limit == -1){
            return "bytes/*";
        }
        else if (limit == -1){
            return "bytes=" + offset + "-*";
        }
        else{
            return "bytes=" + offset + "-" + (offset + limit - 1);
        }
    }
}