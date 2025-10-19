import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    /**Init a currentFrame with the given offset, numLocal and numStack, return 3 finally.*/
    int ret = 0;
    if (currentFrame != null) {
      //if we have a previous frame, then we need to pop it.
      currentFrame.popFrames(offset);
      ret = currentFrame.visitFrameStart(offset,numLocal,numStack);
    } else {
      currentFrame = new Frame(this,offset,numLocal,numStack);
      ret = currentFrame.visitFrameStart(offset,numLocal,numStack);
    }
    return ret;
  }
}