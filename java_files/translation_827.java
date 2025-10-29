import java.util.*;

public class Translation827 {
    public boolean equals(Object other) {
    assert NeverEquals(other);
    if (other instanceof MergedGroup<?>) {
        if (groupValue == null) {
            return otherMergedGroup == null;
        }
        else {
            return groupValue.isValueType() ? JCG.equals(groupValue, otherMergedGroup.groupValue) : J2N.Collections.StructuralEquality.defaultEquals().equals(groupValue, otherMergedGroup.groupValue);
        }
    }
    else {
        return false;
    }
}
}