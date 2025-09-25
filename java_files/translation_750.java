import java.util.*;

public class Translation750 {
    public boolean hasAll(RevFlagSet set) {
    return (flags & set.mask) == set.mask;
}
}