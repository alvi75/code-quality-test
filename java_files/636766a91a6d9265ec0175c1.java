import java.util.*;

public class Generated_636766a91a6d9265ec0175c1 {
    private void enlarge(final int size){
		final int oldSize = this.data.length;
		final int newSize = Math.max(2 * size, 1024);
		if (oldSize >= newSize) {
			return;
		}
		final byte[] newData = new byte[newSize];
		System.arraycopy(this.data, 0, newData, 0, oldSize);
		this.data = newData;
	}
}