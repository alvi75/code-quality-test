import java.util.*;

public class Generated_6367670a1a6d9265ec0179dc {
    private void putAbstractTypes(final int start, final int end) {
        for (int i = start; i < end; i++) {
            if (currentFrame.get(i).isAbstract()) {
                frame.add(currentFrame.get(i));
            }
        }
    }
}