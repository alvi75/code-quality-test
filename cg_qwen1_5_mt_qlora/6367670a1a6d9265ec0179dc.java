import java.util.*;

public class Generated_6367670a1a6d9265ec0179dc {
    /** Add the elements indexed from start to end in currentFrame to Frame.
 * @param start index of first element to add
 * @param end index of last element to add
 */
private void putAbstractTypes(final int start, final int end) {
        for (int i = start; i <= end; ++i) {
            if (!currentFrame.isType(i)) {
                currentFrame.putType(i);
            }
        }
    }
}