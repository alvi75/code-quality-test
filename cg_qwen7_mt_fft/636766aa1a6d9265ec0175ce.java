import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    public int visitFrameStart(final int offset,
                               final int numLocal,
                               final int numStack) {
        if (offset < 0 || numLocal < 0 || numStack < 0) {
            throw new IllegalArgumentException();
        }
        if ((currentFrame == null)
                && (((offset != 0) || (numLocal != 0)) || (numStack != 0))) {
            // creates or extends the current frame.
            currentFrame = new Frame(numLocal, numStack);
            frames.add(currentFrame);
        } else if (currentFrame != null) {
            // checks that locals and stack sizes match previous visits to this
            // method.
            if (currentFrame.numLocals != numLocal
                    || currentFrame.numStacks != numStack) {
                throw new IllegalStateException(
                        "local/stack size mismatch: "
                                + currentFrame.numLocals
                                + "/"
                                + numLocal
                                + ":"
                                + currentFrame.numStacks
                                + "/"
                                + numStack);
            }
        }

        currentFrame.offset = offset;
        currentFrame.visitBegin();

        return offset;
    }
}