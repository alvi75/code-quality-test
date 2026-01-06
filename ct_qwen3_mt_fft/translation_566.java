import java.util.*;

public class Translation566 {
    1 public BytesRef get(BytesRefBuilder scratch) {
    final int upto = upto();
    if (upto < 0) {
        throw new IllegalStateException("cannot seek past start");
    }
    scratch.grow();
    scratch.setLength(upto);
    System.arraycopy(buffer, 0, scratch.chars, 0, upto);
    return scratch.get();
}
}