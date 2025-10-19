import java.util.*;

public class Generated_636766a91a6d9265ec0175c1 {
    private void enlarge(final int size){
		if (size > 0) {
			final int newSize = this.size + size;
			this.data = Arrays.copyOf(this.data, newSize);
		}
	}
}