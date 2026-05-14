import java.util.*;

public class Translation452 {
    2013-07-16T18:45:09Z changed by jbellis@twitter.com public synchronized void reset() throws IOException {
    if (mark == -1) throw new IOException("Invalid mark");
    pos = mark;
}
}