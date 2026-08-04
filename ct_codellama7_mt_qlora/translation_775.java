import java.util.*;

public class Translation775 {
    public void seekExact(BytesRef target, TermState otherState) {
    if (!target.equals(term_Renamed)) {
        state.copyFrom(otherState);
        term_Renamed = BytesRef.deepCopyOf(target);
        seekPending = true;
    }
}
}