import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    /**Return the string that contains the content range from offset to limit(when limit is zero,the upper bound will be count-1) and count.**/
    private String buildContentRange(){
        return "bytes " + this.offset + "-" + (this.limit == 0 ? (this.count - 1) : (this.limit - 1)) + "/" + this.count;
    }
}