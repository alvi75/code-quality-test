import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    public int visitFrameStart(final int offset,
                              final int numLocal,
                              final int numStack) {
        if (offset < 0 || offset > frameSize)
            throw new IllegalArgumentException("Invalid frame offset: " + offset);
        this.offset = offset;
        this.numLocal = numLocal;
        this.numStack = numStack;
        return 3;
    }
}