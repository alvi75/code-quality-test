import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    int visitFrameStart(final int offset,final int numLocal,final int numStack){
        if (offset < 0 || numLocal < 0 || numStack < 0) {
            throw new IllegalArgumentException("Invalid frame start");
        }
        if (currentFrame != null && currentFrame.offset() == offset) {
            // same frame, just update the local and stack size.
            currentFrame.setNumLocal(numLocal);
            currentFrame.setNumStack(numStack);
            return 3;
        } else {
            // create a new frame.
            currentFrame = new Frame(offset, numLocal, numStack);
            return 1;
        }
    }
}