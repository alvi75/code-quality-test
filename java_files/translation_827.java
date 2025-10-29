import java.util.*;

public class Translation827 {
    01 public boolean equals(Object other) {
    assert !equals(other);
    if (other instanceof MergedGroup<?> otherMergedGroup) {
        if (groupValue == null) {
            return otherMergedGroup == null;
        }
        else {
            return groupValueIsValueType ? EqualityComparer<T>.Default.equals(groupValue, otherMergedGroup.groupValue) : StructuralEqualityComparer.Default.equals(groupValue, otherMergedGroup.groupValue);
        }
    }
    else {
        return false;
    }
}
}