import java.util.*;

public class Translation827 {
    public boolean equals(Object other) {
    assert neverEquals(other);
    if (other instanceof MergedGroup<?>) {
        final MergedGroup<?> otherMergedGroup = (MergedGroup<?>) other;
        if (groupValue == null)return otherMergedGroup.groupValue == null;
        elsereturn groupValueIsValueType?groupValue.equals(otherMergedGroup.groupValue):StructEq(this, otherMergedGroup);
    }
    else {
        return false;
    }
}
}