import java.util.*;

public class Generated_636767131a6d9265ec017b23 {
    final void addLineNumber(final int lineNumber) {
        if (lineNumber < 0) {
            throw new IllegalArgumentException("Line number must be >= 0");
        }
        if (this.lineNumbers == null) {
            this.lineNumbers = new ArrayList<>();
        }
        this.lineNumbers.add(lineNumber);
    }
}