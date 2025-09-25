import java.util.*;

public class Translation827 {
    public boolean equals(Object other) {
    if (other instanceof MergedGroup<?>) {
        if (groupValue == null) {
            return other instanceof NullMergedGroup;
        }
        else {
            return groupValueIsValueType ? EqualityComparer.default().equals(groupValue, ((MergedGroup<?>) other).groupValue) : StructuralEqualityComparer.default().equals(groupValue, ((MergedGroup<?>) other).groupValue);
        }
    }
    else {
        return false;
    }
}
}