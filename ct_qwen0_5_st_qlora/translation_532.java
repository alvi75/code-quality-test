import java.util.*;

public class Translation532 {
    public E get(int location) {
    try {
        return a.get(location);
    }
    catch (IndexOutOfBoundsException e) {
        throw new IndexOutOfBoundsException(MessageFormat.format(JGitText.get().indexOutOfBoundsException, Integer.valueOf(location), Integer.valueOf(a.length)));
    }
}
}