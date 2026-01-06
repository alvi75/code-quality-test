import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    int visitFrameStart(final int offset,final int numLocal,final int numStack){
        if (this.frameStart == -1) {
            this.frameStart = offset;
            this.numLocal = numLocal;
            this.numStack = numStack;
            return 3;
        } else {
            throw new IllegalStateException("Frame already started");
        }
    }
}