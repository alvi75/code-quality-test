import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    int visitFrameStart(final int offset,
                        final int numLocal,
                        final int numStack) {
        if (frame != null)
            throw new IllegalStateException("visitFrameStart called while in middle of method");

        frame = new Frame(frameType, offset, numLocal, numStack);
        return 3;
    }
}