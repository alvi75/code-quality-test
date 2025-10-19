import java.util.*;

public class Generated_636766831a6d9265ec0174eb {
    /**Put the given array of files into a stack in reverse order.
 * @param files The files to be added to the stack.
 */
private void addReverse(final File[] files) {
        for (int i = 0; i < files.length; ++i) {
            m_stack.add(0, files[i]);
        }
    }
}