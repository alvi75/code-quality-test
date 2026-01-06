import java.util.*;

public class Generated_636767131a6d9265ec017b23 {
    final void addLineNumber(final int lineNumber) {
        if (lineNumber < 0 || lineNumbers == null) {
            return;
        }
        if (lineNumbers.length == maxLineCount) {
            final int[] newMax = new int[maxLineCount + 1];
            System.arraycopy(lineNumbers, 0, newMax, 0, maxLineCount);
            lineNumbers = newMax;
        }
        lineNumbers[maxLineCount] = lineNumber;
    }
}