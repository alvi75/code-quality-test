import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    private String buildContentRange(){
        if (this.count == 0){
            return null;
        }
        int start = this.offset;
        int end = this.limit > 0 ? this.limit : this.count - 1;
        return "bytes " + start + "-" + end + "/" + this.count;
    }
}