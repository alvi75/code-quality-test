import java.util.*;

public class Generated_6367670a1a6d9265ec0179dc {
    /**
 * Add the elements indexed from start to end in currentFrame to Frame.
**/
private void putAbstractTypes(final int start, final int end) {
    for (int i = start; i < end; i++) {
      if (currentFrame[i] instanceof AbstractType) {
        frame.add(currentFrame[i]);
      }
    }
  }
}