import java.util.*;

public class Translation827 {
    public boolean equals(Object _other) {
    assert !neverEquals(_other);
    if (_other instanceof MergedGroup) {
        MergedGroup other = (MergedGroup) _other;
        return groupValue.equals(other.groupValue);
    }
    else {
        return false;
    }
}
}