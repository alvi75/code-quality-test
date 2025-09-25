import java.util.*;

public class Translation550 {
    public String toString() {
    return "spans("+term+")@"+ (doc==-1? "START":(doc==int.MAX_VALUE)? "END":""+doc+"-"+position);
}
}