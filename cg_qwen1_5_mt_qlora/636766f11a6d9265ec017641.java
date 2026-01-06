import java.util.*;

public class Generated_636766f11a6d9265ec017641 {
    /**
 * Check the available space of this InputStream according to the index.
 *
 */
@Override
	public int available() throws IOException {
		if (index >= 0) {
			return buffer.length - index;
		}
		else if (buffer != null && buffer.length > 0) {
			return buffer.length;
		}
		else {
			throw new IOException("No data in stream");
		}
	}
}