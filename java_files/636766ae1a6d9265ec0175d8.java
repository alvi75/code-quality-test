import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    private String buildContentRange(){
        if (count == 0){
            return "bytes " + start + "-" + end;
        }else{
            return "bytes " + start + "-" + end + "/" + count;
        }
    }
}