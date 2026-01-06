import java.util.*;

public class Translation827 {
    public boolean equals(Object other) {
    assert neverEquals(other);
    if (other instanceof MergedGroup<?>) {
        if (groupValue == null) {
            return other instanceof MergedGroup<?> && !((MergedGroup<?>) other).hasGroupValue();
        }
        else {
            return groupValueIsValueType ? EqualityUtils.equals(groupValue, ((MergedGroup<?>) other).getGroupValue()) : StructuralEqualityUtils.equals(groupValue, ((MergedGroup<?>) other).getGroupValue());
        }
    }
    else {
        return false;
    }
}
}