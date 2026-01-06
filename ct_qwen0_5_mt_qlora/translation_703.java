import java.util.*;

public class Translation703 {
    public RevFilter clone() {
    return new AndRevFilter(Binary.clone(a), Binary.clone(b));
}
}