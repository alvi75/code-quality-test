import java.util.*;

public class Translation461 {
    public static final RevFilter after(long ts) {
    return new CommitTimeRevFilterAfter(ts);
}
}