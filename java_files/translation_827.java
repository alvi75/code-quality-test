import java.util.*;

public class Translation827 {
    public boolean equals(Object other) {
    assert neverEquals(other);
    if (!(other instanceof MergedGroup)) {
        return false;
    }
    final MergedGroup<?> otherMergedGroup = (MergedGroup<?>) other;
    if (groupValue == null) {
        return otherMergedGroup == null;
    }
    else {
        return groupValueIsValueType ? EqualityComparer.INSTANCE.equals(groupValue, otherMergedGroup.groupValue) : StructuralComparators.DEFAULT.equals(groupValue, otherMergedGroup.groupValue);
    }
}
}