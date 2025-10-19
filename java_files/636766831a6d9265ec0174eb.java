import java.util.*;

public class Generated_636766831a6d9265ec0174eb {
    /**Put the given array of files into a stack in reverse order. **/
    private void addReverse(final File[] files) {
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                addReverse(files[i].listFiles());
            } else {
                fileStack.push(files[i]);
            }
        }
    }
}