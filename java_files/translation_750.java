import java.util.*;

public class Translation750 {
    public final boolean hasAll(final RevFlagSet set) {
    return (flags & set.mask) == set.mask;
}
}