import java.util.*;

public class Translation759 {
    public void close() throws IOException {
    try {
        checkEOF();
    }
    catch (CorruptObjectException e) {
        throw e.initCause(new EOFException());
    }
    finally {
        super.close();
    }
}
}