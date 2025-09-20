import java.util.*;

public class Translation775 {
    public void seekExact(BytesRef target, TermState otherState) {
    assert !isOrd || state == null : "state=" + state;
    assert !isOrd || otherState == null : "otherState=" + otherState;
    if (target != term && !target.equals(term)) {
        state.copyFrom(otherState);
        term = BytesRef.deepCopyOf(target);
        seekPending = true;
    }
}
}