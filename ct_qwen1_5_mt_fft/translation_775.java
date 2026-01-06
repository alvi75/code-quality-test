import java.util.*;

public class Translation775 {
    public void seekExact(BytesRef target, TermState otherState) {
    assert !isSeeked();
    if (!target.equals(term)) {
        state.copyFrom(otherState);
        term = BytesRef.deepCopyOf(target);
        seekPending = true;
    }
}
}