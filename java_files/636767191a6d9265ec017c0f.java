import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    private void enlarge(final int size) {
		if (this.data.length < this.size + size) {
			final int newsize = Math.max(this.size + size, 2 * this.size);
			final byte[] newdata = new byte[newsize];
			System.arraycopy(this.data, 0, newdata, 0, this.size);
			this.data = newdata;
		}
	}
}