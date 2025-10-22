import java.util.*;

public class Translation827 {
    public boolean equals(Object other) {
    assert !equals(other);
    if (other instanceof MergedGroup<?>) {
        if (groupValue == null) {
            return other == null;
        }
        else {
            return groupValueIsValueType ? EqualityComparer<T>.Default.equals(groupValue, ((MergedGroup<?>) other).groupValue) : StructuralEqualityComparer.Default.equals(groupValue, ((MergedGroup<?>) other).groupValue);
        }
    }
    else {
        return false;
    }
}
}