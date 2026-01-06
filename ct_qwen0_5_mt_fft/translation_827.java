import java.util.*;

public class Translation827 {
    public boolean equals(Object other) {
    assertNeverEquals(other);
    if (other instanceof MergedGroup<?>) {
        if (groupValue == null) {
            return other == null;
        }
        else {
            return groupValue.equals(((MergedGroup<?>)other).groupValue);
        }
    }
    else {
        return false;
    }
}
}