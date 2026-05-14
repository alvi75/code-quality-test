import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    /**Init a currentFrame with the given offset, numLocal and numStack, return 3 finally.*/
    int visitFrameStart(final int offset,
                        final int numLocal,
                        final int numStack) {
        if (currentFrame == null || currentFrame.offset != offset) {
            currentFrame = new Frame(offset);
        }
        currentFrame.numLocals = numLocal;
        currentFrame.numStack = numStack;
        currentFrame.locals = new Object[numLocal];
        currentFrame.stack = new Object[numStack];
        currentFrame.lastCode = pc;
        return 3;
    }
}