import java.util.*;

public class Translation827 {
    public boolean equals(Object other) {
    assert neverEquals(other);
    if (other instanceof MergedGroup) {
        if (groupValue == null) {
            return otherMergedGroup == null;
        }
        else {
            return groupValue.equals(otherMergedGroup.groupValue);
        }
    }
    else {
        return false;
    }
}
}