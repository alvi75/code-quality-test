import java.util.*;

public class Translation827 {
    public boolean equals(Object other) {
    assertNeverEquals(other);
    if (other instanceof MergedGroup<?>) {
        final MergedGroup<?> otherMergedGroup = (MergedGroup<?>) other;
        if (groupValue == null) {
            return otherMergedGroup == null;
        }
        else {
            return groupValueIsValueType ?StructuralEquators.defaultEqualityComparer().equals(groupValue, otherMergedGroup.groupValue):StructuralEquators.defaultEqualityComparer().equals(groupValue, otherMergedGroup.groupValue);
        }
    }
}
}