import java.util.*;

public class Translation775 {
    public void seekExact(BytesRef target, TermState otherState) {
    if (!target.equals(termRenamed)) {
        state.copyFrom(otherState);
        termRenamed = BytesRef.deepCopyOf(target);
        seekPending = true;
    }
}
}