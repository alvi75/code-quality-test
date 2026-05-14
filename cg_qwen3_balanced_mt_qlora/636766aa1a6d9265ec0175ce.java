import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    int visitFrameStart(final int offset,
                        final int numLocal,
                        final int numStack) {
        if (offset < 0 || numLocal < 0 || numStack < 0) {
            throw new IllegalArgumentException();
        }
        if (currentFrame != null) {
            throw new IllegalStateException();
        }
        currentFrame = new Frame(offset, numLocal, numStack);
        return 3;
    }
}