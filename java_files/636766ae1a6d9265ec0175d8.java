import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    private String buildContentRange(){
        if(count == 0){
            return "0";
        }
        int end = (limit == 0)?count-1:limit;
        return String.valueOf(offset)+"-"+String.valueOf(end);
    }
}