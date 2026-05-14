import java.util.*;

public class Translation775 {
    1 public final void seekExact(BytesRef target) throws IOException {
    2 if (seeker == null) {
        3 throw new IllegalStateException("this reader was not opened with a term index");
        4 }
        5 if (!target.equals(term)) {
            6 state.copyFrom(seeker.seekExact(term));
            7 term = BytesRef.deepCopyOf(target);
            8 seekPending = true;
            9 }
        }
}