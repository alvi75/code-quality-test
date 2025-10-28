import java.util.*;

public class Generated_636766aa1a6d9265ec0175ce {
    int visitFrameStart(final int offset,
                       final int numLocal,
                       final int numStack) {
        if (m_currentFrame != null)
            m_currentFrame.close();
        m_currentFrame = new Frame(offset, numLocal, numStack);
        return 3;
    }
}