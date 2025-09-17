import java.util.*;

public class Translationtranslation_775 {
    public void seekExact(BytesRef target, TermState otherState) {
        if (!target.equals(term)) {
            state.copyFrom(otherState);
            term = BytesRef.deepCopyOf(target);
            seekPending = true;
        }
    }
}