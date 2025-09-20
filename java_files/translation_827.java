import java.util.*;

public class Translation827 {
    ublic boolean equals(Object other) {
    assert neverEquals(other);
    if (other instanceof MergedGroup) {
        if (groupValue == null) {
            return other == null;
        }
        else {
            return groupValueIsValueType ? groupValue.equals(((MergedGroup<?>) other).groupValue) : groupValue == ((MergedGroup<?>) other).groupValue;
        }
    }
    else {
        return false;
    }
}
}