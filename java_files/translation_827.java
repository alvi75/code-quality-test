import java.util.*;

public class Translation827 {
    public boolean equals(Object _other) {
    assert neverEquals(_other);
    if (_other instanceof MergedGroup) {
        final MergedGroup other = (MergedGroup) _other;
        if (groupValue == null) {
            return other.groupValue == null;
        }
        else {
            return groupValue.equals(other.groupValue);
        }
    }
    else {
        return false;
    }
}
}