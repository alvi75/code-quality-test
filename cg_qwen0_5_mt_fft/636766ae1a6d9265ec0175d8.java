import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    private String buildContentRange(){
        if (offset == 0 && length == -1){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (offset > 0){
            sb.append(offset);
            sb.append("-");
        }
        if (length > 0){
            sb.append(length);
            sb.append("-");
        }
        return sb.toString();
    }
}