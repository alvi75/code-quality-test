import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    /**Init a currentFrame with the given offset, numLocal and numStack, return 3 finally.**/
int visitFrameStart(final int offset,
                     final int numLocal,
                     final int numStack) {
        if (numLocal > 0 || numStack > 0) {
            // we have to create a new frame
            currentFrame = new Frame(offset, numLocal, numStack);
            stackMapFrames.add(currentFrame);
        }
        return 3;
    }
}