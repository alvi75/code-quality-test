import java.util.*;

public class Translation775 {
    public void seekExact(BytesRef target, TermState otherState) {
    if (!target.equals(term)) {
        otherState.copyFrom(otherState);
        term = BytesRef.deepCopyOf(target);
        seekPending = true;
    }
}
}