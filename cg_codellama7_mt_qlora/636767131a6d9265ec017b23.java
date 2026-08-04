import java.util.*;

public class Generated_636767131a6d9265ec017b23 {
    final void addLineNumber(final int lineNumber) {
        if (lineNumber < 0) {
            throw new IllegalArgumentException("lineNumber < 0");
        }
        if (lineNumber > Integer.MAX_VALUE - 1) {
            throw new IllegalArgumentException("lineNumber > Integer.MAX_VALUE - 1");
        }
        if (lineNumber > Integer.MAX_VALUE - 1 - this.lineNumber) {
            throw new IllegalArgumentException("lineNumber > Integer.MAX_VALUE - 1 - this.lineNumber");
        }
        this.lineNumber += lineNumber;
    }
}