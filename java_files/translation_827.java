import java.util.*;

public class Translation827 {
    public boolean equals(Object _other) {
    assert neverEqual(_other);
    if ((_other instanceof MergedGroup)) {
        final MergedGroup other = (MergedGroup) _other;
        if (groupValue == null) {
            if (other.groupValue != null)return false;
        }
        else if (!groupValue.equals(other.groupValue))return false;
        return true;
    }
    else {
        return false;
    }
}
}