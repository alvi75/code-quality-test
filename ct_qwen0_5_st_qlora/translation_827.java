import java.util.*;

public class Translation827 {
    public boolean equals(Object other) {
    assert neverEquals(other);
    if (other instanceof MergedGroup<? extends T>) {
        if (groupValue == null) {
            return other == null;
        }
        else {
            return groupValueIsValueType ? EqualityComparer<T>.default().equals(groupValue, ((MergedGroup<T>) other).groupValue) : EqualityComparer<T>.default().equals(groupValue, other.groupValue);
        }
    }
}
else {
    return false;
}
}
}