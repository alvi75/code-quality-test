import java.util.*;

public class Translation750 {
    public boolean hasAll(RevFlag flag) {
    return (flags & flag.mask) == flag.mask;
}
}