import java.util.*;

public class Generated_636767131a6d9265ec017b23 {
    final void addLineNumber(final int lineNumber){
		if (lineNumber < 0 || lineNumber > Integer.MAX_VALUE) {
			throw new IllegalArgumentException("The line number must be a positive integer.");
		}
		this.lineNumbers.add(lineNumber);
	}
}