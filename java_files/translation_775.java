import java.util.*;

public class Translation775 {
    ublic void seekExact(BytesRef target, TermState otherState) {
    if (!target.equals(term_Renamed)) {
        state.copyFrom(otherState);
        term_Renamed = target.deepCopyOf();
        seekPending = true;
    }
}
}