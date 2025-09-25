import java.util.*;

public class Translation775 {
    1 public void seekExact(BytesRef target, TermState otherState) {
    if (!target.equals(term)) {
        state.copyFrom(otherState);
        term = BytesRef.deepCopyOf(target);
        seekPending = true;
    }
}
}