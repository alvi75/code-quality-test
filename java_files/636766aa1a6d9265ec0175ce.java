import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    int visitFrameStart(final int offset,
                       final int numLocal,
                       final int numStack) {
        if (currentFrame == null) {
            currentFrame = new Frame(offset, numLocal, numStack);
            return 3;
        }
        throw new IllegalStateException("visitFrameStart() called twice");
    }
}