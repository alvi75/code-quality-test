import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    int visitFrameStart(final int offset,final int numLocal,final int numStack){
        if(currentFrame!=null){
            currentFrame.setOffset(offset);
            currentFrame.setNumLocal(numLocal);
            currentFrame.setNumStack(numStack);
            currentFrame.setLocal(new FrameLocal[numLocal]);
            currentFrame.setStack(new FrameStack[numStack]);
        }
        return 3;
    }
}