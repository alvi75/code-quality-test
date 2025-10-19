import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    /**
 * /**Init a currentFrame with the given offset, numLocal and numStack, return 3 finally.
 **/
int visitFrameStart(final int offset,final int numLocal,final int numStack){
        if (offset < 0 || numLocal < 0 || numStack < 0) {
            throw new IllegalArgumentException("Invalid frame start: " + offset + ", " + numLocal + ", " + numStack);
        }
        this.currentFrame = new Frame(offset, numLocal, numStack);
        return 3;
    }
}