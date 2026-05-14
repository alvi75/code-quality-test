import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    /**Read a short value from classFileBuffer**/
	public short readShort(final int offset) {
		return (short) ((classFileBuffer[offset] & 0xFF) | ((classFileBuffer[offset + 1] << 8) & 0xFF00));
	}
}