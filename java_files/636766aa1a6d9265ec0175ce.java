import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    public int visitFrameStart(final int offset,
                              final int numLocal,
                              final int numStack) {
        if (offset < 0 || offset > frameSize) {
            throw new IllegalArgumentException("Invalid frame offset: " + offset);
        }
        if (frameOffset != -1 && frameOffset + offset >= frameSize) {
            throw new IllegalArgumentException("Invalid frame offset: " + offset);
        }

        // If we have already visited this frame, then just return the number of locals and stacks.
        if (visitedFrames.containsKey(offset)) {
            return visitedFrames.get(offset).numLocal + visitedFrames.get(offset).numStack;
        }

        // Otherwise, create a new frame object and add it to our list of visited frames.
        Frame frame = new Frame();
        frame.offset = offset;
        frame.numLocal = numLocal;
        frame.numStack = numStack;
        visitedFrames.put(offset, frame);

        // Add the frame to the list of frames that were visited.
        frameList.add(frame);

        return visitedFrames.get(offset).numLocal + visitedFrames.get(offset).numStack;
    }
}